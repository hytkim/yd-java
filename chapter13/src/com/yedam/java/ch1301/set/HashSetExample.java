package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet(); // Set은 수정이없다 인덱스가없어서 지칭할수없기때문에 교체가 불가능함
		
		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("IBATS");
		
		// 객체 크기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// 반복자를 활용해 데이터 확인 이터러블과는 다른거다
		Iterator<String> iterator = set.iterator(); // set 에있는정보를 List 로 만들어서 반환받는다
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("\t" +str);
		}
		System.out.println("-----------");
		// 객체 제거
		set.remove("JDBC");
		set.remove("IBATS");
		System.out.println();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("\t" +str);
		}
		System.out.println("-----------");
		
		for (String string : set) {
			System.out.println("\t"+string);
		}
		
		
		

	}

}
