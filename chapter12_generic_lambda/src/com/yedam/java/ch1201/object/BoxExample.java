package com.yedam.java.ch1201.object;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.setContent(new Date()); // 넣는건 잘 됐는데 꺼내지는것도 잘 될까?
//		Date date = box.getContnet(); // 잘 안된다 데이터타입이 안 맞으니까. 
		Object date = box.getContnet(); // 잘 안 된다.
		
		box.setContent("홍길동");
//		String name = box.getContnet();
		
		box.setContent(1012); // 얘는 들어갈때 Wrapper Class 로 들어간다.
//		Integer value = box.getContnet();
		
	}

}
