package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  in = null;
		
		while(true) {
			in = sc.nextLine();
			System.out.printf("입력된 문자열: %s \n", in);
			if (in.equals("q")) { break; } // 소문자 q가 입력되는 경우 프로그램 중단.
		}
		System.out.printf("입력 종료");
		sc.close();
	}
}
