package com.yedam.java.ch0204;
// ctrl + shift + O 
import java.util.Scanner; // JDK 내장 라이브러리 - 외부라이브러리 불러올 때 사용

public class ScannerCommonExample {

	public static void main(String[] args) {
		// 표준입력장치(System.in/키보드)를 통해 값을 읽어들이는 객체
		Scanner scanner = new Scanner(System.in);

		String inputData = scanner.nextLine(); // nextLine() : 읽어들이는 메서드
		System.out.println(inputData);
		
		System.out.println("프로그램 종료");
		
		scanner.close();
	}

}