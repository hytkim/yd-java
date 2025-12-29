package com.yedam.java.package3;

public class Car {
	// Field => 일반적으로 전부 private 로 선언해야된다, 지금부터 제대로된 클래스 만드는법 알려주께.
	private int spd;      // 0
	private boolean stop; // false
	
	// Constructor

	// Method => getter/setter : field 에 직접 접근하는 method === getter/setter
	// getter/setter 를 제외한 기능에 해단하는 method 또한 존재함.
	
	// field spd getter/setter
	public int getSpd(){
		return this.spd;
	}
	// Method 종료할 때 return, 반복문 종료할 때 break;
	public void setSpd(int spd) {
		if (spd < 0) { // speed는 음수일 수 없기 때문에 잘못된 값을 입력 할 경우 초기화.
			this.spd = 0;
			return; // void에는 반환값이없는데 경우에따라 return을 쓰는데, method를 종료하기위해 return을 선언해주는 경우가 있다.
		}
		this.spd = spd;
	}
	
	// field stop getter/setter 
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.spd = 0; // stop이 값을 가질때 연동이되는 부분이 있어서 이부분도 같이 해줘야된다.
		// 단순히 정해진 필드의값을 변경하는것으로 끝나는게 아닌 유효성 체크를 해줘야한다.
	}
}
