package com.yedam.java.ch0702.field;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 0; i < 8; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞좌파 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞좌파", 15);
				break;
			case 2:
				System.out.println("앞우파 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞우파", 13);
				break;
			case 3:
				System.out.println("뒤좌파 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤좌파", 14);
				break;
			case 4:
				System.out.println("뒤좌파 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤우파", 17);
				break;

			default:
				break;
			}
			System.out.println("---------------------------------------------");
		}
		
	}

}
