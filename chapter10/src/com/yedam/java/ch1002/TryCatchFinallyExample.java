package com.yedam.java.ch1002;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// 특정 클래스 자체에 대한 정보를 가지는 Class 클래스가 있다.
		try {
			Class clazz = Class.forName("java.lang.String2"); // String2라는 이름의 클래스를 찾는듯 
			clazz.getMethods(); // 특정 클래스가 가지고 있는 메서드에대한 시그니처를 끌어낸다, 무슨메서드를 가지고있는지 같은 meta Data, 클래스이름, 패키지, 멤버(필드, 생성자, 메서드)
			
			System.out.println(clazz.getMethods());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
	}
}
