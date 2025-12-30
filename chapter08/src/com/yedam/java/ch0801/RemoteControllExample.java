package com.yedam.java.ch0801;

import java.util.Scanner;

public class RemoteControllExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int selected = 0;
		while (true) {
			selected = Integer.parseInt(sc.nextLine());
			if (selected == 1) { // 페어링 1번 : TV
				rc = new Television();
				rc.turonOn();
				rc.setVolume(12);
				rc.turnOff();
			}else if (selected == 2) { // 페어링 2번 : Audio
				rc = new Audio();
				rc.turonOn();
				rc.setVolume(12);
				rc.turnOff();
			}else {
				break; //run = false;
			}
		}
		//sc.close();
		
		// Television tv = new Television();
		// String str;
	}
}
