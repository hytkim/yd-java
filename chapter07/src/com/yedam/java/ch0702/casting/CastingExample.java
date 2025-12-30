package com.yedam.java.ch0702.casting;

public class CastingExample {

	public static void main(String[] args) {
		Parent p = new Parent();
		
		if (p instanceof Child) {
			Child c = (Child)p;
			c.method1();
			c.method2();
			c.method3();			
		} else {
			System.out.println("해당 Instance는 Child 객체가 아닙니다.");
		}
		
		// 실제로 강제타입변환 쓰는 경우
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); // 이거이제 못쓰잖아 child 에서 생성한 고유 멤버니까.
		// => 자식클래스의 고유멤버를 써야 하는 경우에 강제 타입변환을 사용한다.
		if (parent instanceof Child) {
			child = (Child)parent;
			child.method3();
		}else {
			System.out.println("해당 Instance는 Child 객체가 아닙니다.");
		}

	}
}
