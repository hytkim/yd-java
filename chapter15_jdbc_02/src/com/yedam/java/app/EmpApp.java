package com.yedam.java.app;

import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		//for (Emp emp : EmpDAO.getInstance().selectAll()) { System.out.println(emp); }
		boolean run = true;
		// 이번엔 공백을 포함한 문장을 입력할 일이 없어서 sc.nextLine() 안 쓴다.
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = EmpDAO.getInstance();
		
		while (run) {
			int menuNo = -1;
			
			System.out.println("");
			System.out.println("==================================================================");
			System.out.println("1.등록 | 2. 수정 | 3. 삭제 | 4.사원조회 | 5.사원전체조회 | 9.종료");
			System.out.println("==================================================================");
			System.out.print("선택>>"); 
			
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력한 값이 숫자가 아닙니다.");
				sc.next();
				continue;
			}
			
			if (menuNo == 1) { // 등록
				Emp emp = new Emp();
				System.out.print("이름 >> ");
				emp.setFirstName(sc.next());
				System.out.print("성 >> ");
				emp.setLastName(sc.next());
				System.out.print("이메일 >> ");
				emp.setEmail(sc.next());
				System.out.print("전화번호 >> ");
				emp.setPhoneNumber(sc.next());// 82.10.1234.1234
				System.out.print("입사일(yyyy-MM-dd) >> "); //(ps. java.util.Date : yy/MM/dd)
				emp.setHireDate(Date.valueOf(sc.next())); // String 을 date 로 바꿔주는 Date 의 valueOf() 
				System.out.print("직급 >> ");
				emp.setJobId(sc.next()); // SA_REP
				System.out.print("연봉 >> ");
				emp.setSalary(sc.nextDouble());
				System.out.print("상여 >> ");
				emp.setCommissionPct(sc.nextDouble());; // 0.15
				System.out.print("상사 >> ");
				emp.setManagerId(sc.nextInt()); // 149
				System.out.print("부서 >> ");
				emp.setDepartmentId(sc.nextInt()); // 80
				
				dao.insertInfo(emp);
			} else if (menuNo == 2) { // 수정
				Emp emp = new Emp();
				System.out.print("사원번호 >> ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("성 >> ");
				emp.setLastName(sc.next());
				
				dao.updateInfo(emp);
			} else if (menuNo == 3) { // 삭제
				System.out.print("사원번호 >> ");
				dao.deleteInfo(sc.nextInt());
				
			} else if (menuNo == 4) { // 단건 조회
				System.out.print("사원번호>> ");
				int empId = sc.nextInt();
				Emp findEmp = new Emp();
				findEmp.setEmployeeId(empId);
				Emp output = dao.selectInfo(findEmp);
				System.out.println(output);
			} else if (menuNo == 5) { // 전체 조회
				for (Emp emp : dao.selectAll()) {
					System.out.println(emp);
				}
			} else if (menuNo == 9) {
				run = false;				
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("메뉴를 다시 확인해 주세요.");
			}
		}

		sc.close();
	}

}
