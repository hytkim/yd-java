package com.yedam.java.ch1201.generic;

public class Util {
	public <T> T plus(T x, T y) {
		return x;
	}
	public static<S> Box<S> boxing(S s){
		Box<S> box = new Box<>();
		box.setContent(s);
		return box;
	}

}
