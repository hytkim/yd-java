package com.yedam.java.test;

import java.util.Scanner;

public class Oonhang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int tongjang = 0;
		int select = -1;
		
		while (run) {
			System.out.printf("----------------------------------");
			System.out.printf("\n1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.printf("\n----------------------------------");
			System.out.printf("\n선택 : ");
			select = Integer.parseInt(scanner.nextLine());
			
			if (select == 1) {
				System.out.printf("예금액 : ");
				tongjang += Integer.parseInt(scanner.nextLine());
			}
			else if(select == 2) {
				System.out.printf("출금액 : ");
				int choolgum = Integer.parseInt(scanner.nextLine());
				
				if (tongjang >= choolgum) {
					tongjang -= choolgum;
				}else {
					System.out.printf("잔액이 부족합니다!\n출금 가능액 : %d원\n", tongjang);
				}
			}
			else if(select == 3) {
				System.out.printf("현재 잔액 : %d\n", tongjang);
			}
			else if(select == 4) {
				System.out.printf("이용해 주셔서 감사합니다!");
				run = false;
			}
		}
		scanner.close();

	}

}
