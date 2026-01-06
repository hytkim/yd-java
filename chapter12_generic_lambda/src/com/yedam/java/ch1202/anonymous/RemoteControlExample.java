package com.yedam.java.ch1202.anonymous;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("암튼켰음");
			}
			@Override
			public void turnOff() {
				System.out.println("암튼껏음");
			}
			
		};
		rc.turnOff();
		rc.turnOn();

	}

}
