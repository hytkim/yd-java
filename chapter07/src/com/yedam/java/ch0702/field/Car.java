package com.yedam.java.ch0702.field;

public class Car {
	// Field
	Tire frontLeftTire = new Tire("앞좌파", 6);
	Tire frontRightTire = new Tire("앞우파", 2);
	Tire backLeftTire = new Tire("뒤좌파", 3);
	Tire backRightTire = new Tire("뒤우파", 4);
	
	// Constructor
	
	// Method
	int run () {
		System.out.println("[자동차가 달립니다.]");
		if (!frontLeftTire.roll()) { stop(); return 1; }
		if (!frontRightTire.roll()) { stop(); return 2; }
		if (!backLeftTire.roll()) { stop(); return 3; }
		if (!backRightTire.roll()) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
