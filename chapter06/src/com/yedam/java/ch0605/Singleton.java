package com.yedam.java.ch0605;

public class Singleton {
	// private : 외부에서 접근할 수 없도록 처리
	// 1) 자기자신을 필드로 가짐
	private final static Singleton singleton = new Singleton();
	// 2) 외부에서 new 연산자 호출을 막음
	private Singleton() {}
	// 3) 정적 메서드를 통해 내부에 선언된 필드를 반환
	public static Singleton getInstatnce() {
		return singleton;
	}
}
