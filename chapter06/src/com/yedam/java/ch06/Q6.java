package com.yedam.java.ch06;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Q 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
			System.out.println("-------------------------------------------------------------");
			
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				scores = new int[Integer.parseInt(sc.nextLine())];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("\nscores[%d]> ", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
			} else if (selectNo == 4) {
				int max = scores[0];
				double sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max <= scores[i]) {
						max = scores[i];
					}
					sum += scores[i]; // 변수를 다루는 방식과 명칭이 최종결과에 종속되는것이아니라 변수를 다루는 과정에 의미가 있어야 한다.
				}
				sum /= (double)scores.length;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+sum/(double)scores.length);
			} else if (selectNo == 5) {
				run = false;
			} 
		}

		System.out.println("프로그램 종료");
		sc.close();
	}

}