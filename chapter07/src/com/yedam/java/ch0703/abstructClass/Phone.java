package com.yedam.java.ch0703.abstructClass;

// abstract class : 자신의 Instance 를 못 가짐
public abstract class Phone {
	// Field
	public String owner;
	
	// Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// Method
	public void turnOn() {
		System.out.println("Phone - turn on");
	}
	public void turnOff() {
		System.out.println("Phone - turn off");
	}
}
