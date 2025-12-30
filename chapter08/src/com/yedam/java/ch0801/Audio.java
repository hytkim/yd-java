package com.yedam.java.ch0801;

public class Audio implements RemoteControl {
	// Field
	private int volume; // interface는 instance field를 가지지 않기때문에 모든 구현클래스의 공통된 feild 라도 각각 선언해줘야 한다.

	@Override
	public void turonOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if (volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;			
		}
		System.out.println(" setVolume " + this.volume);
	}

}
