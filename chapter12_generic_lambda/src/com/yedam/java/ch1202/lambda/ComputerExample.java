package com.yedam.java.ch1202.lambda;

public class ComputerExample {

	public static void main(String[] args) {
		Computer cc = (x, y) -> {
			int res = x + y;
			return res;
		};
		
		System.out.println(cc.plus(77+777, 7777));

		cc = (x, y) -> { return x+y;};
		System.out.println(cc.plus(77+777, 7777));
		
		cc = (x, y) -> x+y;
		System.out.println(cc.plus(77+777, 7777));
	}

}
