package com.yedam.java.test;

import java.util.Scanner;

public class Nansoo {

	public static void main(String[] args) {
		boolean run = true;
		int question = (int)(Math.random()*50) + 1;
		int answer = -1;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.printf("숫자 입력 : ");
			answer = Integer.parseInt(scanner.nextLine());
			
			if (answer > question) {
				System.out.println("down하세요!!");
			} else if (answer < question) {
				System.out.println("up하세요!!");
			} else if (answer == question) {
				System.out.println("축하합니다!!");
				run = false;
			}else {
				continue;
			}
		}
		scanner.close();
	}

}
