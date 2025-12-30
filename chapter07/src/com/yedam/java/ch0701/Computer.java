package com.yedam.java.ch0701;

// Child Class
public class Computer extends Calculator{
	// must override(반드시 해야한다. 오버라이드) or implement(혹은 구현) a supertype(부모클래스타입) method(함수를)
	// The method areaCircl(double) of type Computer must override or implement a supertype method
	// 오버라이딩 한거 안 한거 구분하기위한 주석으로써 구분자역할도 한다.
	@Override double areaCircle(double r) {
		System.out.println("Computer 객체가 부모클래스의 areaCircle()를 재정의한 것을 실행");
		return Math.PI * r * r;
	}
}
