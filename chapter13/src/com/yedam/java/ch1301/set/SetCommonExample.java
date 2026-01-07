package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Set;

public class SetCommonExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		
		// 객체 추가
		set.add("홍길동");
		set.add("박길동");
		set.add("홍길동"); // 중복객체라서 추가가 안 됨 
		
		// 크기
		int size = set.size();
		System.out.println("총 객체 수 : "+size);

	}

}
