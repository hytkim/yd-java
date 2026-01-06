package com.yedam.java.ch1101.string;

public class CommonMethodExample {

	public static void main(String[] args) {
		// charAt :
		String ssn = "010624-3230123";
		char gender = ssn.charAt(7);
		if (gender == '1' || gender == '3') {
			System.out.println("테토");
		}else {
			System.out.println("에겐");
		}

		// indexOf : 1) 실제 위치 확인 2) 포함여부
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍"); // "자바 프로그래밍" 에서 프로그래밍이 시작하는 위치 [3] 
		System.out.println("해당 위치: "+location);
		
		if (subject.indexOf("자바") > -1) { 
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련없는 책입니다.");
		}

	}

}
