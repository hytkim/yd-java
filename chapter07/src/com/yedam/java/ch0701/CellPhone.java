package com.yedam.java.ch0701;

public class CellPhone {
	// Field
	String model;
	String color;
	// Constructor
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("CellPhone Parent Instance Create");
	}
	
	//Method
	void powerOn() {System.out.println("power on ");}
	void powerOff() {System.out.println("power off ");}
	void bell() {System.out.println("call the bell of CellPhone");}
	void sendVoice(String message) { System.out.println("자기 : "+message);}
	void receiveVoice(String message) { System.out.println("상대방 : "+message);}
	void hangUp() {System.out.println("kill the CellPhone");}
	
	// 이런것도 되긴하는데 클래스이름의메서드생성, 그런데 클래스는 파스칼, 메서드는 카멜 이라 애초에안맞고 이렇게쓰지도않는다.
	void cellPhone() {	}
}