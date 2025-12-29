package com.yedam.java.package1;

public class B {
	A a; // 같은 패키지 내에있는 default 생성자라서 접근 가능
	
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("STRING");
	
	public B() {
		A a = new A();
		a.f1 = 1;
		a.f2 = 1;
//		a.f3 = 1; // not visible: private AccessModifiler  -> 외부클래스에서 사용불가 
		
		a.m1();
		a.m2();
//		a.m3(); // not visible : private AccessModifiler  -> 외부클래스에서 사용불가
	}
}
