package com.yedam.java.ch0702.parameter;

public class Driver {
	// Field

	// Constructor

	// Method : 왜 이런 구조로 만드는지 생각을 해 봐라 - 운전자의 면허에 따라 다른 대상을 운전하는, 결과가 달라진다.
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
