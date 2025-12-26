package com.yedam.java.ch0605;

public class Calculator { // 정적(static : 고정된, 정적인) 멤버 : 독립된 인스턴스를 필요로하지않는,
	String type = "기본";
	// static String type = "기본"; // 이러면 method도 얘 있어야되니까 heap영역에 string만들어서 자기영역으로 값주소 끌어와서 세팅해둔다 
	static double pi = 3.141592653589793238462643383279;
	static int plus(int x, int y) {
		return (x+y);
	}
	static int minus(int x, int y) {
		return (x-y);
	}
	
}
