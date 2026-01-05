package com.yedam.java.ch1101.clazz;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class stringMeta = Class.forName("java.lang.String");
		System.out.println(stringMeta.getName());       // 패키지명 + 클래스 포함된, Java가 인식하는 풀 네임
		System.out.println(stringMeta.getSimpleName()); // 클래스 이름
		System.out.println(stringMeta.getPackageName());// 패키지명
		System.out.println(stringMeta.getFields()[0]);  // 실제 필드
		System.out.println(stringMeta.getMethods()[0]); // 메서드 시그니처
		
	}
}
