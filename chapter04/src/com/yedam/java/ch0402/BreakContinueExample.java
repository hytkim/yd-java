package com.yedam.java.ch0402;

import java.util.Iterator;

public class BreakContinueExample {

	public static void main(String[] args) {
		// continue <=> pass
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			for (int j = 1; j < 10; j++) {
				System.out.printf("\n %d x %d = %d", i, j, i * j);
			}
			System.out.println();
		}

		// 중첩 반복문에서 break 문 : break 문은 어디까지 멈춰줄까? 자신이 포함 되어있는 반복문만 중단 시킨다.
		for (char i = 'A' ; i <= 'Z' ; i++) {
			boolean isExit = false;
			for (char j = 'a'; j <= 'z'; j++) {
				System.out.println(i + " - " + j);
				// 소문자 g 일경우 반복문 전체를 종료하고 싶다면
				// if (j == 'g') break; // 이걸론 안 됨
				// 이런식으로 내부반복문과 외부 반복문을 연결 해 줘야함.
				if (j == 'g') { 
					isExit = true;
					break;
				}
			}
			if (isExit) break; // 이걸론 안 됨
		}
		
		// 이런방식으로 외부 for 문에 label 을붙여서 해당 label 을 break 시킬 수 있다. 
		Outter:for (char i = 'G' ; i <= 'Z' ; i++) {
			for (char j = 'a'; j <= 'z'; j++) {
				System.out.println(i + " - " + j);
				if (j == 'g') break Outter;
			}
		}
		
		
	}

}
