package com.yedam.java.ch0604;

public class ReferenceExample {

	public static void main(String[] args) {
		int[] dataList = { 1, 3, 5, 7 };
		Computer com = new Computer(); 
		int result = com.plus(dataList);
		System.out.println("result > "+ result);
		
		for (int i : dataList) {
			System.out.println("dataList > " + i);
		}
		
		Car c = new Car();
		c.keyTurnOn();
		c.run();c.run();c.run();c.run();c.run();c.run();
		c.setSpd(-2000);
		System.out.println(c.getSpd());
		
		
	}

}
