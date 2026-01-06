package com.yedam.java.ch1201.generic;

public class Box<T>{ // 아 나는 Generic Type 쓸거고 그 Type 은 <T> 로 표시하겠다.
	private T content;
	// 모든 클래스가 상속받는 최상위 클래스 오브젝트타입으로 넣으면
	public void setContent(T content) {
		this.content = content;
	}
	public T getContnet() {
		return this.content;
	}
}
