package com.yedam.java.ch0202;

public class CharExample {

	public static void main(String[] args) {
		// char : 유니코드
		int val = 65;
		char c1 = 65; // 유니코드 65 => A
		
		System.out.println(val +", "+ c1);// 65, A

		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		int v2 = 'C'; // char 타입의 리터럴은 홀따옴표로 표시
		char c3 = 'C'; // 내부적으로 처리방식은 동일하지만 출력할때 숫자냐 유니코드문자냐의 차이
		System.out.println(v2 +", "+ c3); // 67, C
		
		String str = "CA"; // 문자열을 다루는 참조타입 
		char[] cAry = str.toCharArray();
		System.out.println(cAry[0] +", " +cAry[1]);
	}

}
