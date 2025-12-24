package com.yedam.java.ch0501;

public class StringEcample {

	public static void main(String[] args) {
		// String ( 참조 타입 )
		String str1 = "신용권";
		String str2 = "신용권";
		if (str1 == str2)
			System.out.println("1. 해당 객체들은 같은 객체입니다.");
		else
			System.out.println("1. 해당 객체들은 서로 다른 객체입니다.");
		
		str2 = "이것이 자바다";
		if (str1 == str2) 
			System.out.println("1-2. 해당 객체들은 같은 객체입니다.");
		else
			System.out.println("1-2. 해당 객체들은 서로 다른 객체입니다.");
		
		System.out.println("str 1 : " + str1); // 신용권
		System.out.println("str 1 : " + str2); // 이것이 자바다
		
		// 일반 클래스( 참조 타입 )은 서로 다른변수를 사용하더라도 가리키는 대상이 같다면 같은 정보를 공유한다
		int[] ary1 = {1, 2, 3};
		int[] ary2 = ary1; // = &ary1 => {1, 2, 3}
		ary2[1] = 10; // &ary1[2] = 10; 
		System.out.println(ary1[1]); // 10
		
		// 참조타입 비교와 NullPointerException 을 알려주마
		// int를 기준으로 만들어지는 배열이지만, 참조타입이므로 null 을 가질 수 있따.
		int[] third = null; // 값 을 저장하고있는 객체가 없다.
		
		// 가리키는 대상이 없다 : NullPointerException( 참조 타입에서만 발생하는 에러! ), 그런데 가리키는 대상이 없어도 length 는 호출 가능하다. 
		// 변수가 가리키는 대상이 있는지, 초기화를 했는지 검토 필요
		// System.out.println(third.length); //아마도 배열객체에 내장된 함수라서? 
		
		// new 연산자를 사용한 동등 비교 값을기준으로 비교하되, 변수가 지닌 값을 비교한다
		String strA = new String("신용권"); // new 연산자를 이용하면 내부적으로 서로 다른 형태의 객체를 생성하여 진행된다.
		String strB = new String("신용권"); // String 과 같은 참조타입은 변수가 가리키고있는 객체의 메모리주소를 통해 비교를한다.
		System.out.println("strA : "+strA);
		System.out.println("strB : "+strB);
		if (strA == strB) 
			System.out.println("2. 해당 객체들은 같은 객체입니다.");
		else
			System.out.println("2. 해당 객체들은 서로 다른 객체입니다.");
		
		
		if (strA.equals(strB))
			System.out.println("2-2. 해당 객체들은 같은 객체입니다.");
		else
			System.out.println("2-2. 해당 객체들은 서로 다른 객체입니다.");
		
		// 참고로하나더알려주께 : 대소문자 무시하고 순수하게 데이터를 구분할 때 사용
		if (strA.equalsIgnoreCase(strB)) {}
		
	}
	
}