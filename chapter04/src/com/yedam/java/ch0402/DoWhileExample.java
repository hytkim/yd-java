package com.yedam.java.ch0402;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		
		do {
			inputData = scanner.nextLine();
			System.out.println("input Data = " + inputData);
		} while (!inputData.toLowerCase().equals("q")); // 조건에 주의해라. true여야 무한으로 도니까 true값 나올수 있도록.
	
		scanner.close();

	}
	
}
