package com.yedam.java.ch0701;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// child class
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "어썸플래티넘골드", 18);
		
		// extends CellPhone Class Members
		// Field
		System.out.println("modle: "+dmbCellPhone.model);
		System.out.println("color: "+dmbCellPhone.color);
		
		// Method
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hellow olrd, I'm Java Master");
		dmbCellPhone.receiveVoice("Well come to my Youtube Studio");
		dmbCellPhone.sendVoice("Nice to meet you");
		dmbCellPhone.hangUp();
		
		System.out.println("채널 :" + dmbCellPhone.channel);
		
		dmbCellPhone.turnOnDmb();;
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();;
		

	}

}
