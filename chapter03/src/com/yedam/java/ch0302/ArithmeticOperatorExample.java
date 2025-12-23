package com.yedam.java.ch0302;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 교재 P151, 6번
		int v = 356;
		int r = v - v % 100; // || v / 100 * 100;
		r ^= 12; 
		System.out.println( r );

	}

}
