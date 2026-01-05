package com.yedam.java.ch1101.object;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {
	public static void main(String[] args) {
		// <Key   ,  Value>
		Map<Member, String> map = new HashMap<Member, String>();
		
		// 값을 저장 
		map.put(new Member("A"), "흑길동");
		
		// 값을 읽을때 : "A"라는 String값을 저장할때 new연산자 안 썼으니까 각 ID는 동일한 메모리주소를 가지는 불변 String 인스턴스객체의 주소를 가짐
		String name = map.get(new Member("A"));
		System.out.println(name);
		
//		System.out.println(new Member("A"));//클래스이름@메모리주소
		System.out.println(new Member("A").toString());
	}
}
