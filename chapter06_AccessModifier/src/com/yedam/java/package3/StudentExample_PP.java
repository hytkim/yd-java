package com.yedam.java.package3;

import java.util.Scanner;

public class StudentExample_PP {
	public static void main(String[] args) {
		boolean run = true; // 프로그램의 실행여부
		int studentNum = 0; // 학생수
		Student[] scoreList = null; // 학생들의 점수목록
		Scanner scanner = new Scanner(System.in); // 사용자의 입력

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			// 메뉴선택
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) { // 학생수 입력 => 배열의 크기
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scoreList = new Student[studentNum];
			} else if (selectNo == 2) { // 점수입력 => 배열의 모든 값을 입력
				// 배열 <=> for문 사용
				for(int i=0; i < studentNum; i++) { // 인덱스
					System.out.print("이름> ");
					String name = scanner.nextLine();
					System.out.print("국어점수> ");
					int korScore = Integer.parseInt(scanner.nextLine());
					System.out.print("수학점수> ");
					int mathScore = Integer.parseInt(scanner.nextLine());
					System.out.print("영어점수> ");
					int engScore = Integer.parseInt(scanner.nextLine());
					
					Student student = new Student(name, korScore, mathScore, engScore);
					// 여기까지 한 학생의 정보를 인스턴스화 시킨 상황
					
					scoreList[i] = student;
					// 학생들의 점수목록에 추가
				}				
			} else if (selectNo == 3) { // 점수출력
				// 배열 <=> for문 사용
				System.out.println("이름 | 국어 | 수학 | 영어");
				for(int i=0; i < studentNum; i++) { // 인덱스
					// i번째에 해당하는 학생 정보를 가져옴.
					Student student = scoreList[i];
					// 학생의 정보를 출력하는 메소드
					student.ShowInfo();
				}
			} else if (selectNo == 4) {
				/*
				 국어점수 중 최고점 받은 학생이름, 국어점수
				 수학점수 중 최고점 받은 학생이름, 수학점수
				 영어점수 중 최고점 받은 학생이름, 영어점수
				 */
				MaxScore korMax = new MaxScore(0, scoreList[0].getKorScore());
				MaxScore mathMax = new MaxScore(0, scoreList[0].getMathScore());
				MaxScore engMax = new MaxScore(0, scoreList[0].getEngSocre());
				
				for(int i=0; i < studentNum; i++) {
					Student student = scoreList[i];
					if(korMax.getScore() < student.getKorScore()) {
						korMax.setIdx(i);
					}
					if(mathMax.getScore() < student.getMathScore()) {
						mathMax.setIdx(i);
					}
					if(engMax.getScore() < student.getEngSocre()) {
						engMax.setIdx(i);
					}
				}
				System.out.printf("국어 최고점을 받은 학생은 %s이고 점수는 %d\n", scoreList[korMax.getIdx()].getName(), scoreList[korMax.getIdx()].getKorScore());
				System.out.printf("수학 최고점을 받은 학생은 %s이고 점수는 %d\n", scoreList[mathMax.getIdx()].getName(), scoreList[mathMax.getIdx()].getMathScore());
				System.out.printf("영어 최고점을 받은 학생은 %s이고 점수는 %d\n", scoreList[engMax.getIdx()].getName(), scoreList[engMax.getIdx()].getEngSocre());

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
		scanner.close();

	}
}
