package com.yedam.java.ch0402;

import java.util.Scanner;

public class Page182To183 {

	public static void main(String[] args) {
		// Q1 : for while do while
		
		// Q2 : for 1~100, i%3 == 0
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i%3 != 0) continue;
			sum += i;
		}
		System.out.println("sum = " + sum);

		Scanner sc = new Scanner(System.in);
		// Q3 : Math.random
		while (true) {
			int d1 = (int)(Math.random() * 6) + 1;
			int d2 = (int)(Math.random() * 6) + 1;
			
			System.out.printf("주사위 2개 결과 (%d, %d)", d1, d2);
		}
	}

}
