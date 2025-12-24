package com.yedam.java.ch0502;

public class ArrayCommonExample {

	public static void main(String[] args) {
		// 배열 선언 및 생성
		int[] intAray = null; 
		
		// 배열 선언 후 생성 = > 2가지 방법
		// 값을 기준으로 크기를 설정하기때문에 new int[3] {1, 3, 4}; 형식은 불가능하다.
		intAray = new int[] {1, 3, 4}; // 값을 가지고 있는 배열 : [I@28a418fc
		System.out.println("선언한 배열 객체의 크기는 바꿀 수 없는데, 변수가 참조하는 주소를 변경하는거라서 가능" + intAray);
		System.out.println(intAray + "길이: " + intAray.length); // length : ReadOnly
		for (int i = 0; i < intAray.length; i++) {
			System.out.println(i + ")" + intAray[i]);
		}
		intAray = new int[5];		   // 크기만 지정된 배열 : [I@5305068a => { 0,0,0,0,0 }
		System.out.println("선언한 배열 객체의 크기는 바꿀 수 없는데, 변수가 참조하는 주소를 변경하는거라서 가능" + intAray);
		System.out.println(intAray + "길이: " + intAray.length);
		for (int i = 0; i < intAray.length; i++) {
			intAray[i] = i * 10;
			System.out.println(i + ") " + intAray[i]);
		}
		
	}

}
