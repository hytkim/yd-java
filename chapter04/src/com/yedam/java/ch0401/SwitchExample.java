package com.yedam.java.ch0401;

public class SwitchExample {

	public static void main(String[] args) {
		// Math.random() : 0 <= x < 1, x는 실수
		int time = (int) (Math.random() * 4) + 8; // 8, 9, 10, 11
		System.out.println("[현재시간 : " + time + "시]");

		switch (time) {
		case 8: {
			System.out.println("근출 합니다.");
			break;
		}
		case 9: {
			System.out.println("아침회의를 합니다.");
			break;
		}
		case 10: {
			System.out.println("업무를 봅니다.");
			break;
		}
		default:
			System.out.println("외근을 나갑니다.");
		}
		char grade = 'b';
		switch (grade) {
		case 'a' :
		case 'A': {
			System.out.println("90점 이상");
			break;
		}
		case 'b' :
		case 'B': {
			System.out.println("80점 이상");
			break;
		}
		case 'c' :
		case 'C': {
			System.out.println("70점 이상");
			break;
		}
		case 'd' :
		case 'D': {
			System.out.println("60점 이상");
			break;
		}
		default:
			System.out.println("60점미만");
		}
		
		System.out.println("------------------------------------------------------------");
		int score = 93;
		switch (score / 10) {
		case 10: {
			System.out.println("A+");
			break;
		}
		case 9: {
			System.out.println("90점 이상");
			break;
		}
		case 8: {
			System.out.println("80점 이상");
			break;
		}
		case 7: {
			System.out.println("70점 이상");
			break;
		}
		case 6: {
			System.out.println("60점 이상");
			break;
		}
		default:
			System.out.println("낙제");
		}
		
	}

}
