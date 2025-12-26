package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		// .(dot) : 객체접근연산자
		Calculator c = new Calculator();
		c.powerOn();
		System.out.println(c.plus(17, 23));
		System.out.println(c.division(841, 7));
		c.powerOff();
		
		int[] x = {1, 2, 3,4,5,6,7,8};
		System.out.println("1. 배열로받기 " + c.plusesA(x));
		
		// 이거 잘 안 쓴다.
		int[]y = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("2. 가변파라미터로 받기 " + c.plusesB(1));// 이것도가능 : c.plusesB(10, 5, 3);
	}

}