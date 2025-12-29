package com.yedam.java.ch0605;

public class Car {
	int spd; // instance field
	
	// instance method
	void run() { 
		System.out.println(spd + "으로 달립니다.");
		testMethod();// instance method 에서 static method 호출 가능.
	}
	public static void testMethod() {};
	
	// static method : instance method/field 호출 불가능하다.
	public static void main(String[] args) {
		// 정적멤버는 컴파일 시 메서드영역에 이미 적재되어 있지만, 그때 class 의 instance 는 heap 영역에 반드시 생성되어있지 않기 때문이다. 
		testMethod(); // static 에서 static 부르는건 상관없다.
		// spd = 60;
		// run();
		
		// 꼭 필요하다면 인스턴스를만들어줘야함
		Car myCar = new Car();
		myCar.spd = 60;
		myCar.run();
	}
}
