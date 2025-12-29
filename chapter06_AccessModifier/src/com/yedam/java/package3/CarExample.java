package com.yedam.java.package3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpd(-540);
		System.out.println("현재 속도1 :"+myCar.getSpd());
		
		//올바른 속도 변경
		myCar.setSpd(60);
		myCar.setSpd(20);
		myCar.setSpd(180);
		System.out.println("현재 속도2 :"+myCar.getSpd());
		
		//멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도3 :"+myCar.getSpd());

	}

}
