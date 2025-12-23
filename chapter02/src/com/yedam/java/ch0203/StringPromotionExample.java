package com.yedam.java.ch0203;

public class StringPromotionExample {

	public static void main(String[] args) {
		// + 연산 : 이새끼가 문제다.
		String str1 = String.valueOf(1 + 2 + 3); // String.valueOf 다른데이터타입을 => 문자열로 
		str1 = 1 + 2 + 3 + "";     // 위에꺼랑밑에꺼 결과가 같다 "6" 
		String str2 = 1 + 2 + "3"; // "33"
		String str3 = 1 + "2" + 3; // "123"
		String str4 = "1" + 2 + 3; // "123" - 문자열부터 시작하니까 "15"가 아니라 "1"+2, "12"+3 순서로 간다.
		String str5 = "1" + (2 + 3); // "15"
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 캐스팅 : 각 타입별 메서드 사용
		int    v1 = Integer.parseInt("1234");
		double v2 = Double.parseDouble("2.5");
		double re = v1 + v2;
		System.out.println(re);
	}

}
