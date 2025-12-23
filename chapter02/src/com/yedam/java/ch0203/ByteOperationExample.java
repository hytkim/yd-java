package com.yedam.java.ch0203;

public class ByteOperationExample {
	
	public static void main(String[] args) {
		// integer Operation
		
		// 1) int 보다 자료형의 크기가 작은 타입 기준으로 연산 -> int로 캐스팅
		byte x = 30;
		byte y = 50;
		byte z = ( byte )(x + y); // x + y를 계산하기위해 기본 자료형인 정수타입으로 변환되니까 다운캐스팅 불가능하다고 에러남.
		
		// 2) long 타입이 포함될 경우 모두 long으로 캐스팅
		int a = 100;
		long b =  150L;
		//int c = a + b; // error
	}
	
}
