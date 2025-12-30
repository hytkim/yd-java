package com.yedam.java.ch0701;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		// Parent Class - Instance Create
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		// Child Class - Instance Create : 다시쓴다고 해도 원본은 숨겨져있는상태라 재정의메서드를 지우면 접근가능한 부모클래스의 함수를 호출한다.
		Computer c = new Computer();
		System.out.println("원 면적 : " + c.areaCircle(r));

	}

}
