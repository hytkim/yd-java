package com.yedam.java.ch0603;

public class Car {
	// 필드 : 객체의 정보(속성)
	String company;   // 제조사 정보
	String model;     // 모델
	String color;     // 색깔
	int maxSpeed;	  // 최고속도
	int currentSpeed; // 현재속도(상태값)
	
	// 생성자 : 리턴타입이 없고, 고유이름 대신 클래스명을 사용
	//        => 인스턴스 생성 시 초기값 설정이 목적
	public Car(String model, String color) {
		this.company = "현대자동차"; // 가장가까운 실행블록 안에서 전체 살아있기때문에, this 안 써도 문제없다.
		this.model = model; // 변수의 유효범위(스코프)가 겹친다면, 로컬변수가 가장 우선순위가 높다 - 그래도 다르게쓰는건 권장하지않는데
		this.color = color;		
	}
	public Car(String company, String model, String color) {
		this(model, color);
		this.company = company;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		this(company, model, color);
		this.maxSpeed = maxSpeed;
	}

}