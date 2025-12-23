package com.yedam.java.ch0302;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 복합대입연산자 중 산술연산자와 결합한 형태
		// +=, -=, *=, /=, %= -> 1) 산술연산, 2) 대입연산 순서로 실행
		
		int res = 10;
		res += 10; // res = res + 10;
		System.out.println("res = " + res); // 20
		
		res -= 5;
		System.out.println("res = " + res); // 15
		
		res *=3;
		System.out.println("res = " + res); // 45
		
		res /= 5;
		System.out.println("res = " + res); // 9
		
		res %=3;
		System.out.println("res = " + res); // 0

	}

}
