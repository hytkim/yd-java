package com.yedam.java.ch0702.promotion;

public class PromotionExample {
	
	public static void main(String[] args) {
		// 하나의 Parent 인스턴스 p 에서 변수가 가리키고있는 인스턴스만 바꾸면 전체코드를 수정하지않고도 다른 결과를 보여줄 수 있다. 
		Child child = new Child();
		System.out.println("Child Type Instance Create");
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		// 기존의 child 가 가리키는 instance 를 공유하는 형태가 된다.
		Parent p = child; // 차일드인스턴스와 패런트인스턴스가 동일한 객체를 가리킨다.  
		System.out.println("Child Type Instance Promotion Parent");
		p.method1();
		p.method2();
//		p.method3();
		System.out.println();
		
		System.out.println("GrandChild Class Instance Create");
		p = new GrandChild();
		p.method1();
		p.method2();
		
	}

}
