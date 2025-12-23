package com.yedam.java.ch0202;

public class IntegerExample {

	public static void main(String[] args) {
		// byte : 1byte => 8bit
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
// Type mismatch: cannot convert from int to byte 
// => literal은 기본 int로인식하는데 byte에 대입할때 자동 형변환이 일어나는데 byte의 범위를 벗어났기 때문에 에러
		//byte v5 = 128; // -128 ~ 127 
		
		// int  : 4byte => Default
		//long var1 = 10000000009999999990L;// literal 자체의 타입을 변환하지않으면 에러 발생
		
		// long : 8byte

	}

}
