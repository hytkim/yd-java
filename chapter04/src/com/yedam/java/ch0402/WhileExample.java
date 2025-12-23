package com.yedam.java.ch0402;

public class WhileExample {

	public static void main(String[] args) {
		// While 1) 횟수제한없이 조건에 따라 반복 2) 무한루프를 활용
		// 제어가 쉽지않고, 코드가 누락되는 경우가 잦다
		// 예시를보여줄게, 정수 1 ~ 10까지 출력
		
		int i = 1;
		while(i < 11) {
			System.out.println("i= " + i);
			i++; // 이거빠지는순간 무한루프걸리잖아.
		}
		// 그렇다면 실제 while 문은 어찌쓰느냐.
		i = 1;
		while(true) {
			if (i > 10) break;
			System.out.println("i =" + i);
			i++;
		}
	}
	
}
