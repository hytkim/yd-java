package com.yedam.java.ch1201.object;

public class Box {
	private Object content;
	// 모든 클래스가 상속받는 최상위 클래스 오브젝트타입으로 넣으면
	public void setContent(Object content) {
		this.content = content;
	}
	public Object getContnet() {
		return this.content;
	}
}
