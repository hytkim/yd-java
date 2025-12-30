package com.yedam.java.ch0703;
// Parent Class
public abstract class Animal {
	// Field
	public String kind;
	// Constructor
	
	// Method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// abstract Method : abstract class && do not body => Method Overriding 
	public abstract void sound();

}
