package com.yedam.java.package3;

import java.util.Scanner;

public class StudentsExample {

	public static void main(String[] args) {
		// Q 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램
		boolean run = true;
		Student[] students = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
			System.out.println("-------------------------------------------------------------");
			
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				students = new Student[Integer.parseInt(sc.nextLine())];
			} else if (selectNo == 2) {
				if (students.length < 1) {
					continue;
				}
				
				for (int i = 0; i < students.length; i++) {
					System.out.printf("\n학생 국어점수 수학점수 영어점수[%d]> ", i);		
					students[i] = new Student(sc.nextLine().split(" "));
				}
			} else if (selectNo == 3) {
				if (students.length < 1) {
					continue;
				}
				for (Student student : students) {
					student.ShowInfo();
				}
			} else if (selectNo == 4) {
				if (students.length < 1) {
					continue;
				}
				int maxKor = students[0].getKorScore();
				int maxMath = students[0].getMathScore();
				int maxEng = students[0].getEngSocre();
				
				int maxKorIndex = -1;
				int maxMathIndex = -1;
				int maxEngIndex = -1;
				
				for (int i = 0; i < students.length; i++) {
					if (maxKor <= students[i].getKorScore()) {
						maxKor = students[i].getKorScore();
						maxKorIndex = i;
					}
					
					if (maxMath <= students[i].getMathScore()) {
						maxMath = students[i].getMathScore();
						maxMathIndex = i;
					}
					
					if (maxEng <= students[i].getEngSocre()) {
						maxEng = students[i].getEngSocre();
						maxEngIndex = i;
					}
				}
				System.out.println("국어 최고 점수: "+maxKor + ", " + students[maxKorIndex].getName());
				System.out.println("수학 최고 점수: "+maxMath + ", " + students[maxMathIndex].getName());
				System.out.println("영어 최고 점수: "+maxEng + ", " + students[maxEngIndex].getName());
			} else if (selectNo == 5) {
				run = false;
			} 
		}

		System.out.println("프로그램 종료");
		sc.close();
	}

}