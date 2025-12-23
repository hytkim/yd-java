package com.yedam.java.ch0402;

// import java.util.Scanner;

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

		//Scanner sc = new Scanner(System.in);
		// Q3 : Math.random
		while (true) {
			int d1 = (int)(Math.random() * 6) + 1;
			int d2 = (int)(Math.random() * 6) + 1;
			
			System.out.printf("주사위 2개 결과 (%d, %d)\n", d1, d2);
			if (d1 + d2 == 5) {
				break;
			}
		}
		
		// Q4 : 4x + 5y = 60 의 모든 해
		for (int i = 1; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				if (4*i + 5*j == 60) 
					System.out.println("x = " + i + ", y = "+ j);
			}
		}
		
		// Q5 : ㄴ 삼각형
		for (int i = 0; i < 5; i++) {
			String str = "";
			for (int j = 5-(5-i); j > 0; j--) {				
				str += "*";
			}
			System.out.println(str);
		}
		System.out.println("--------------------------------------");
		// Q6 : 역ㄴ 삼각형
		for (int i = 0; i < 4; i++) {
			String str = "";
			for (int j = 0; j < 5; j++) {
				if (j+i < 4) {
					str += " ";					
				}
				else {
					str += "*";
				}
			}
			System.out.println(str);
		}
		
	}

}
