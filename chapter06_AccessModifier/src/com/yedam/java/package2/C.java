package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
	// A cannot be resolved( 정의되다 ) to a type 정의 되지 않은 타입이다
//	A a; // com.yedam.java.package1 의 default package : 접근불가
	B b; // com.yedam.java.package1의 public package :  접근가능
	
	A a1 = new A(true); // 생성자가 public 이여도, default 클래스인 A자체를 인식 못 하기 때문에 의미가 없다. 
//	A a2 = new A(1);
//	A a3 = new A("STRING");
	
	C() {
		A a = new A();
		a.f1 = 1;
//		a.f2 = 1; // not visible : default AccessModifiler  -> 외부패키지에서 사용불가
//		a.f3 = 1; // not visible : private AccessModifiler  -> 외부클래스에서 사용불가
		
		a.m1(); 
//		a.m2(); // not visible : default AccessModifiler  -> 외부패키지에서 사용불가
//		a.m3(); // not visible : private AccessModifiler  -> 외부클래스에서 사용불가
	}
}
