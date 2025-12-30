package com.yedam.java.ch0702.field;

public class HankookTire extends Tire {
	// Field
	
	// Constructor
	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// Method
	@Override
	public boolean roll() {
		++this.accumulatedRotation; // 회전수 1 증가
		if (this.accumulatedRotation < this.maxRotiation) {
			// 현재 누적회전수보다 최대 회전수가 작을 경우 정상 주행
			System.out.println(location + " HankookTire 수명 : " + (this.maxRotiation - this.accumulatedRotation) + "회");
			return true;
		}else {
			// 현재 누적회전수가 최대 회전수에 도달한 경우 펑크
			System.out.println("*** "+this.location + " HankookTire 펑크 ***");
			return false;
		}
	}

}
