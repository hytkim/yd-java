package com.yedam.java.ch0604;

public class Calculator {
	// 메서드 선언
	// 리턴타입 메서드이름 ( [매개변수, ...] ) { 실행블록 }
	// 1) turn On   2) turn Off   3) plus   4) division
 	void powerOn() {
		System.out.println("turn On");
	}
	void powerOff() {
		System.out.println("turn Off");
	}
	int plus(int x, int y) {
		return x + y;
	}
	// 동적 크기의 변수 처리방법 
	// 1.배열로 선언
	public int plusesA(int[] x) {
		int sum = 0;
		for (int y : x ) {
			sum += y;
		}
		return sum;
	}
	// 2. 가변파라미터로선언
	public int plusesB(int ... values) {
		int res = 0;
		for (int v : values ) {
			res += v;
		}
		return res;
	}
	double division(int x, int y) {
		return (double)x / y;
	}
}
