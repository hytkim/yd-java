package com.yedam.java.ch0701;
// Child Class : CellPhone(Parent Class) + DMB
public class DmbCellPhone extends CellPhone {
	// extends : Parent Class Member Free Use
	// Field
	int channel;
	// Constructor
	DmbCellPhone(String model, String color, int channel){
		// Instance Member : this
		super(model, color);
//		this.model = model;
//		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone Child Instance Create");
	}
	// Method
	void turnOnDmb() {System.out.println("채널 "+this.channel + "번 DMB 방송 수신을 시작합니다.");}
	void changeChannelDmb(int channel) { this.channel = channel; System.out.println("채널 "+this.channel + "번으로 바꿉니다.");}
	void turnOffDmb() {System.out.println("DMB 방송 수신을 종료합니다.");}
}
