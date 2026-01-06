package com.yedam.java.ch1101.string;

public class ByteToStringExample {
	
	public static void main(String[] args) {
		// 실제로 주고받는 데이터는 byte 타입기준 : 파일저장할때도 byte 단위다.
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		// String 생성자를 통해 사람이 인식할 수 있는 문자로 변환
		String str1 = new String(bytes); // 유니코드값 기준으로 처리
		System.out.println(str1); // Hello Java
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
	
}
