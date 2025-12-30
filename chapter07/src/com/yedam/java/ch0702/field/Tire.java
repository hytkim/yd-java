package com.yedam.java.ch0702.field;

public class Tire {
	// Field
	public int maxRotiation;		// 최대 회전수
	public int accumulatedRotation; // 누적 회전수
	public String location;			// 타이어의 위치
	
	// Constructor
	Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotiation = maxRotation;
	}
	
	// Method
	public boolean roll() {
		++this.accumulatedRotation; // 회전수 1 증가
		if (this.accumulatedRotation < this.maxRotiation) {
			// 현재 누적회전수보다 최대 회전수가 작을 경우 정상 주행
			System.out.println(location + " Tire 수명 : " + (this.maxRotiation - this.accumulatedRotation) + "회");
			return true;
		}else {
			// 현재 누적회전수가 최대 회전수에 도달한 경우 펑크
			System.out.println("*** "+this.location + " Tire 펑크 ***");
			return false;
		}
	}

}