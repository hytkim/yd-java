package com.yedam.java.ch1101.object;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		
		if (obj1 == obj2) {
			System.out.println("동일한 인스턴스 참조중");
		} else {
			System.out.println("서로 다른 인스턴스 참조중");
		}
		
		if (obj1.equals(obj2)) {
			System.out.println("동일한 값을 지닌 인스턴스");
		} else {
			System.out.println("서로 다른 값의 인스턴스");
		}
	}

}
