package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver Load
		Class.forName("oracle.jdbc.OracleDriver");// 드라이버이름은 내가사용하는 O JDBC - 버전에따라 이름 바뀌니까 주의. JDK v9 이상

		// 2. DB Connect : 연결할 DB정보 필요
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String password = "hr";

		Connection conn = DriverManager.getConnection(url, username, password);
		/************************************************* INSERT ************************************************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String insert = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insert); // ? 11개에 대한 처리가 안 되어있어서 각항목에 대해 직접 Data 타입 세팅 해줘야한다.
		ps.setInt   (1, 1000); // (?의 순서, ?에 들어갈 값 : 왼쪽부터 1부터 들어감)
		ps.setString(2, "Kil-Dong");
		ps.setString(3, "Hong");
		ps.setString(4, "kdHong@google.com");
		ps.setString(5, "82.10.1234.1234");
		ps.setString(6, "21/11/05"); // DB에서는 HIRE DATE 타입으로 정의되어있는데 문자열로 주는 EU가 있다.
		ps.setString(7, "SA_REP");
		ps.setDouble(8, 6000);
		ps.setDouble(9, 0.15);
		ps.setInt   (10, 149);
		ps.setInt   (11, 80);
		// 3-2. SQL 전달 및 실행
		int result = ps.executeUpdate(); // 몇 건이 등록되었습니다, 몇건이 실행되었습니다의 정수만 반환
		// 3-3. 반환결과 처리
		System.out.println("insert 결과 : "+result);
		/************************************************* UPDATE ************************************************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String update = """ 
				UPDATE employees 
				SET last_name = ? 
				WHERE employee_id = ?				
				""";
		ps = conn.prepareStatement(update);
		ps.setString(1, "Kang");
		ps.setInt   (2, 1000);
		// 3-2. SQL 전달 및 실행
		result = ps.executeUpdate();
		// 3-3. 반환결과 처리
		System.out.println("update 결과 : "+result);
		/************************************************* SELECT ************************************************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String select = """
				SELECT *
				FROM employees
				ORDER BY employee_id
				""";
		ps = conn.prepareStatement(select);
		// 3-2. SQL 전달 및 실행
		ResultSet rs = ps.executeQuery();
		// 3-3. 반환결과 처리
		while (rs.next()) {
			System.out.println(rs.getString("employee_id") +"> " +rs.getString("last_name")+ ", " +rs.getString("first_name"));
		}
		/************************************************* DELETE ************************************************/
		// 3. SQL 실행
		// 3-1. Statement or PreparedStatement 객체 생성
		String delete = """
				DELETE FROM	employees
				WHERE employee_id = ?
				""";
		// 3-2. SQL 전달 및 실행
		ps = conn.prepareStatement(delete);
		ps.setInt(1, 1000);
		
		result = ps.executeUpdate();
		// 3-3. 반환결과 처리
		System.out.println("delete 결과 : "+result);
		// 4. 자원해제 : 실행시점의 반대로 진행
		
		if(rs != null)   rs.close(); // select 결과받은 ResultSet
		if(ps != null)   ps.close();
		if(conn != null) conn.close();
	}

}
