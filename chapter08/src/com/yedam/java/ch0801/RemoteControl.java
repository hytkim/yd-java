package com.yedam.java.ch0801;

public interface RemoteControl {
	// Constant
	public final static int MAX_VOLUM = 10;
	//The blank final field MIN_VOLUM may not have been initialized
	public int MIN_VOLUM = 0; // 파이널을 선언하지않았으나 상수로 인식한다. final static 키워드가 없어도 상수로 인식한다.
	
	// Abstract Method
	public abstract void turonOn();
	public void turnOff(); // 별도의 abstract 키워드가 필요 없음
	public void setVolume(int volume);

}
