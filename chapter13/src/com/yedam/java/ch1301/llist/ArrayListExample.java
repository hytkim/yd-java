package com.yedam.java.ch1301.llist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// 객체 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); // 이렇게되면 기존 2번 인덱스 이후에 위치한것들은 뒤로 밀리는 인덱스 재설정이 발생한다.
		list.add("iBATIS");
		
		// 객체 수정
		list.set(0, "자바");

		// 크기
		int size = list.size();
		System.out.println("총 개체 수 : " + size);
		
		// 조회
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.printf("%d : %s \n", i, str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.printf("%d : %s \n", i, str);
		}
		System.out.println();
		
		for (String string : list) {
			System.out.println(string);
		}

	}

}
