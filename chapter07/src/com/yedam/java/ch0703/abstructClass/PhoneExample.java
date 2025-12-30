package com.yedam.java.ch0703.abstructClass;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone p = new Phone("Kim"); // 스스로 생성자를 호출 할 수 없어서 자식클래스가 필요하다.
		
		SmartPhone smp = new SmartPhone("Hong Kill dong");
		
		smp.turnOn();
		smp.internetSearch();
		smp.turnOff();
	}
}
