package com.yedam.java.ch0801;

public class SmartTv implements RemoteControl, Searchable {
	// Field
	private int volume;

	// Method
	// Searchable Implements
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	// RemoteControl Implements
	@Override
	public void turonOn() {
		System.out.println(" turonOn ");
	}

	@Override
	public void turnOff() {
		System.out.println(" turnOff ");
	}

	@Override
	public void setVolume(int volume) {
		// Instance 멤버에서는 static member 에 접근하는데 제한이 없다. static 멤버에서는 Instance가생성되어있을때만
		// 접근가능하다 주의!
		if (volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		} else if (volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		} else {
			this.volume = volume;
		}
		System.out.println(" setVolume " + this.volume);
	}

}
