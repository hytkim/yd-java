package com.yedam.java.ch1101.wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// 박싱 : 기본타입 -> Wrapper 
		Integer obj1 = new Integer(100);// 안쓰는방식 
		// 자동박싱
		Integer obj2 = 200; 
		Integer obj3 = 200;
		
		// 내부적으로 가진 값은 같지만 다른 객체로 인식한다.
		// byte 범위 -128 ~ 127 에서는 자동으로 언박싱 비교를하기때문에 착각할수있는데 주의해라
		if (obj2 == obj3) {
			System.out.println("같은객체 이   다.");
		}else {
			System.out.println("다른객체 이   다.");
		}
		if (obj2.equals(obj3)) {
			System.out.println(" 같은 값 이   다.");
		}else {
			System.out.println(" 다른 값 이   다.");
		}
		
		System.out.println(obj2);
		//언박싱 : Wrapper 클래스 -> 기본타입
		int v1 = obj1.intValue(); // 이게 기본
		//자동 언박싱
		int v2 = obj2;
		int v3 = obj3;
		// 연산에서 자동 언박싱 진행
		int res = obj2 * 2 + 100 + obj3;
		System.out.println(res);

	}

}
