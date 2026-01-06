package com.yedam.java.ch1201.generic;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		// 제네릭은 인스턴스 생성시점에 반드시 결정 되어야 함.
		Box<Date> dateBox = new Box<Date>();
		dateBox.setContent(new Date());
		Date today = dateBox.getContnet();
		
		// 다른 타입 쓰려면 새로만들어야된다
		Box<String> strBox = new Box<String>();
		strBox.setContent("홍길동");
		String name = strBox.getContnet();
		
		Box<Integer> intBox = new Box<>();
		intBox.setContent(1012);
		Integer value = intBox.getContnet();
	}

}
