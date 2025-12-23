package com.yedam.java.ch0402;

import java.util.Scanner;

public class Page182Question7 {
	
	public static void main(String[] args) {
		// Q 7. while Scanner
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
				
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int inputData = 0;
			
			switch ( Integer.parseInt(scanner.nextLine()) ) {
			case 1 :
				System.out.printf("\n예금액 > ");
				inputData = Integer.parseInt(scanner.nextLine());
				balance += inputData; 
				break;
			case 2 :
				System.out.printf("\n출금액 > ");
				inputData = Integer.parseInt(scanner.nextLine());
				if ( inputData <= balance) 
					balance -= inputData;
				else 
					System.out.printf("\n출금액 이 예금액 보다 작습니다. \n");
				break;
			case 3 :
				System.out.printf("\n잔고> %d \n", balance);
				break;
			case 4 :
				System.out.printf("\n프로그램 종료 \n");
				run = false;
				break;
			}
			
		}
		scanner.close();
	}
	
}