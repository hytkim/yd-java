package com.yedam.java.ch0402;

import java.util.Iterator;

public class ForcommonExample {
	
	public static void main(String[] args) {
		// for문 1) 반복횟수 2) 무한루프에 빠질 위험이 적음
		// 정수 1 ~ 10까지 출력
		int sum = 0;
		for (int i = 10; i > 0; i--) {
			sum += i;
			if (i == 1) {
				System.out.println("sum = " + (float)sum/10.0);
			}
		}
		
		// 실수 0.1 ~ 1.0까지 출력 : 내부적으로 값을 저장하는방식이 정수와 다르므로
		// "미터(m)" 단위로 0.000001을 더하는 대신, 단위를 "나노미터(nm)"로 바꿔서 정수 1을 더하는 식으로 써야한다.
		for (float i = 0.1f; i <= 1.0f; i+=0.1f) {
			// System.out.printf("\ni = %.1f", i); // 이건 못맞춘다. 주의 해라
		}
		
	}

}