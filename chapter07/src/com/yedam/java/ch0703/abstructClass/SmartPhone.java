package com.yedam.java.ch0703.abstructClass;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch(){
		System.out.println("Search the Internet");
	}

}
