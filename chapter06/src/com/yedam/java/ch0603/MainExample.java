package com.yedam.java.ch0603;

public class MainExample {

	public static void main(String[] args) {
		// class 내부에 생성자가 하나라도 존재하면 기본생성자 안 만드러줌
		Car hongCar = new Car("캐스퍼", "초록");
		Car pjwCar  = new Car("PJW", "Yellow");
		Car kiaCar  = new Car("Kiya", "rei", "golden");
		Car lostCar  = new Car("loast", "Golx", "FFFFF", 800);
		System.out.println("현대자동차 " +hongCar.color + "색 "+ hongCar.model);
		System.out.println("현대자동차 " +pjwCar.color + "색 "+ pjwCar.model);
		System.out.println(kiaCar.company +" "+kiaCar.color + "색 "+ kiaCar.model);
		System.out.println(lostCar.company +" "+lostCar.color + "색 "+ lostCar.model + lostCar.maxSpeed);
		
	}

}
