package com.yedam.java.ch0604;

import java.util.Iterator;

public class Car {
	// Field
	int spd;
	
	// Constructor
	
	// Method
	int getSpd() {
		return this.spd;
	}
	
	void keyTurnOn() {
		System.out.println("부릉 부릉 ~");
	}
	void setSpd(int spd) {
		this.spd += spd;
		if (spd < 0) {
			this.spd = 0;
		}
	}
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			this.setSpd(i);
			System.out.println("달립니다.(시속:"+ this.getSpd() + "km/h)");
		}
	}

}
