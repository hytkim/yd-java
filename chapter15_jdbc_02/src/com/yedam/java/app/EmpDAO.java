package com.yedam.java.app;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

// DAO(Data Access Object)
public class EmpDAO {
	// Oracle 연결정보 분리 : 언제든 교체될수있는 리터럴값은 SQL이외에 코드로 존재해서는 안 된다.
	// Properties 를 활용하여 노출되면 안되는 리터럴값을 코드에서 분리한다.
	private final String   driver;
	private final String      url;
	private final String username;
	private final String password;
	// 각 Method 에서 공통적으로 사용하는 필드 : 다중접속 프로그램이면 이 방식으로는 불가능하다.
	private Connection      conn = null;
	private PreparedStatement ps = null;
	private ResultSet         rs = null;
	// Singleton : EmpDAO 를 전담 관리하는 전문가를 하나 만든다
	private static EmpDAO empDAO = null;
	private EmpDAO() {
		// 파일경로
		String resourcePath = "config/db.properties";
		Properties properties = new Properties(); // Map Collection 중 하나.

		// 파일을 읽을때 사용하는 바이너리기반의 입력 스트림 db.properties 개발할때 정보나 설정을 저장하기위해사용하는거라 텍스트기반이아니다.
		InputStream is = EmpDAO.class.getClassLoader().getResourceAsStream(resourcePath);
		try {
			properties.load(is); // .properties 형식으로 해당 파일을 읽어들이는것이다. Key=Value 규칙으로 정해진 구조에 맞춰서 파일전체를 읽어들이는것 
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver   = properties.getProperty("jdbc_driver");
		url      = properties.getProperty("db_url");
		username = properties.getProperty("db_username");
		password = properties.getProperty("db_password");
	}
	public static EmpDAO getInstance() {
		if (empDAO == null) 
			empDAO = new EmpDAO();
		return empDAO;
	}

	// Method
	private void connect() {
		try {
			// 1. JDBC Driver Load
			Class.forName(driver);// 드라이버이름은 내가사용하는 O JDBC - 버전에따라 이름 바뀌니까 주의. JDK v9 이상
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void disconnect() {
		try {
			// 4. 자원해제 : 실행시점의 반대로 진행
			if (rs != null)	rs.close(); // select 결과받는 ResultSet
			if (ps != null)	  ps.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체조회 => SELECT
	public List<Emp> selectAll() {
		List<Emp> list = new ArrayList<>();
		try {
			connect();

			// 3. SQL 실행
			// 3-1. Statement or PreparedStatement 객체 생성
			String select = """
					SELECT *
					FROM employees
					ORDER BY employee_id
					""";
			ps = conn.prepareStatement(select);
			ps = conn.prepareStatement(select);
			// 3-2. SQL 전달 및 실행
			rs = ps.executeQuery();
			// 3-3. 반환결과 처리
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
				list.add(emp);
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	// 단건조회 => SELECT
	public Emp selectInfo(Emp selectedEmp) {
		Emp findEmp = null;
		try {
			connect();

			// 3. SQL 실행
			// 3-1. Statement or PreparedStatement 객체 생성
			String select = """
					SELECT *
					FROM employees
					WHERE employee_id = ?
					""";
			ps = conn.prepareStatement(select);
			ps.setInt(1, selectedEmp.getEmployeeId());
			// 3-2. SQL 전달 및 실행
			rs = ps.executeQuery();
			// 3-3. 반환결과 처리
			if (rs.next()) {
				findEmp = new Emp();
				findEmp.setEmployeeId(rs.getInt("employee_id"));
				findEmp.setFirstName(rs.getString("first_name"));
				findEmp.setLastName(rs.getString("last_name"));
				findEmp.setEmail(rs.getString("email"));
				findEmp.setPhoneNumber(rs.getString("phone_number"));
				findEmp.setHireDate(rs.getDate("hire_date"));
				findEmp.setJobId(rs.getString("job_id"));
				findEmp.setSalary(rs.getDouble("salary"));
				findEmp.setCommissionPct(rs.getDouble("commission_pct"));
				findEmp.setManagerId(rs.getInt("manager_id"));
				findEmp.setDepartmentId(rs.getInt("department_id"));
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findEmp;
	}
	// 등록
	public  int insertInfo(Emp newEmp) {
		int result = 0;
		try {
			connect();
			// 3. SQL 실행
			String insert = "INSERT INTO employees VALUES(EMPLOYEES_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(insert);
//			ps.setInt   (1, newEmp.getEmployeeId()); // (?의 순서, ?에 들어갈 값 : 왼쪽부터 1부터 들어감)
			ps.setString(1, newEmp.getFirstName());
			ps.setString(2, newEmp.getLastName());
			ps.setString(3, newEmp.getEmail());
			ps.setString(4, newEmp.getPhoneNumber());
			ps.setDate  (5, newEmp.getHireDate()); // DB에서는 HIRE DATE 타입으로 정의되어있는데 문자열로 주는 EU가 있다.
			ps.setString(6, newEmp.getJobId());
			ps.setDouble(7, newEmp.getSalary());
			ps.setDouble(8, newEmp.getCommissionPct());
			ps.setInt   (9, newEmp.getManagerId());
			ps.setInt  (10, newEmp.getDepartmentId());
			// 3-2. SQL 전달 및 실행
			result = ps.executeUpdate(); // 몇 건이 등록되었습니다, 몇건이 실행되었습니다의 정수만 반환
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		// 3-3. 반환결과 처리
		return result;
	}
	// 수정
	public  int updateInfo(Emp selectedEmp) {
		int result = 0;
		try {
			connect();
			String update = """ 
					UPDATE employees 
					SET last_name = ? 
					WHERE employee_id = ?				
					""";
			ps = conn.prepareStatement(update);
			ps.setString(1, selectedEmp.getLastName());
			ps.setInt   (2, selectedEmp.getEmployeeId());
			// 3-2. SQL 전달 및 실행
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		// 3-3. 반환결과 처리
		return result;
	}
	// 삭제
	public  int deleteInfo(int empId) {
		int result = 0;
		try {
			connect();
			String delete = """
					DELETE FROM	employees
					WHERE employee_id = ?
					""";
			// 3-2. SQL 전달 및 실행
			ps = conn.prepareStatement(delete);
			ps.setInt(1, empId);
			
			result = ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		// 3-3. 반환결과 처리
		return result;
	}
}
