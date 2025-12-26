package com.yedam.java.ch0602;
// 라이브러리 클래스 : 내부에 main 메서드가 없음, 실제 객체를 정의
public class Car {
	// 필드 : 객체의 정보(속성)
	String company = "현대자동차"; // 제조사 정보
	String model   = "그랜저";     // 모델
	String color   = "black";      // 색깔
	int maxSpeed   = 250;		   // 최고속도
	int currentSpeed;			   // 현재속도(상태값)
	
	// public Car() {}; // 자바가 컴파일할때, 클래스 내부에 생성자가 누락될 시, 이 형식으로 자바가 강제로 넣어줌.
}