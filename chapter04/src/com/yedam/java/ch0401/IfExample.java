package com.yedam.java.ch0401;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		// IF문 : 조건식이 참인 경우만 확인
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		// IF ~ ELSE문 : 조건식이 참과 거짓, 각각 확인
		if (score >= 90) {
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("해당 과목은 통과되었습니다.");
		}else {
			System.out.println("점수가 60점 미만입니다.");
			System.out.println("해당 과목은 재수강 대상입니다.");			
		}
		
		// IF ~ ELSE IF ~ ELSE문 : 다중 조건문
		if (score >= 90) {
			System.out.println("과목 등급은 A입니다.");
		}else if (score >= 80) {
			System.out.println("과목 등급은 B입니다.");
		}else if (score >= 70) {
			System.out.println("과목 등급은 C입니다.");
		}else if (score >= 60) {
			System.out.println("과목 등급은 D입니다.");
		}else {
			System.out.println("과목 등급은 F입니다.");
		}

	}

}
