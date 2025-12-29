package com.yedam.java.package3;

public class Student {
	// Field
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;
	
	// Constructor
	Student(String ... studentInfo){
		for (int i = 0; i < studentInfo.length; i++) {
			switch (i) {
			case 0: {
				this.name = studentInfo[i];
				break;
			}
			case 1: {
				this.korScore = Integer.parseInt(studentInfo[i]);
				break;
			}
			case 2: {
				this.mathScore = Integer.parseInt(studentInfo[i]);
				break;
			}
			case 3: {
				this.engScore = Integer.parseInt(studentInfo[i]);
				break;
			}
			default:
				break;
			}
		}
	}
	Student(String name, int kor, int math, int eng){
		this.name = name;
		this.korScore = kor;
		this.mathScore = math;
		this.engScore = eng;
	}
	
	// Method
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		// 입력받은 학생이름값이 올바르지않을경우 반환하는 로직 필요
		//if (name.) {}
		this.name = name;
	}
	
	public int getKorScore() {
		return this.korScore;
	}
	public void setKorScore(int korScore) {
		// 입력받은 점수가 유효한지 검사하는 조건문 필요
		this.korScore = korScore;
	}
	
	public int getMathScore() {
		return this.mathScore;
	}
	public void setMathScore(int mathScore) {
		// 입력받은 점수가 유효한지 검사하는 조건문 필요
		this.mathScore = mathScore;
	}
	
	public int getEngSocre() {
		return this.engScore;
	}
	public void setEngSocre(int engScore) {
		// 입력받은 점수가 유효한지 검사하는 조건문 필요
		this.engScore = engScore;
	}
	
	// Function
	public void ShowInfo() {
		String info = "이름 : "+ this.name + 
				", 국어점수 : "+this.korScore + 
				", 수학점수 : "+ this.mathScore + 
				", 영어점수 : "+this.engScore;
		System.out.println(info);
	}
}
