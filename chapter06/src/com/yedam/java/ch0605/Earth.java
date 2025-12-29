package com.yedam.java.ch0605;

public class Earth {
	// 불변성을 가진 데이터 :> 상수(기본타입만 가능)
	// static 과 final 문법의 위치는 상관없다.
	// 정적필드 + final = 상수, 이름 = 대문자 + 스네이크 표기법
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	// 인스턴스 필드 + final => 인스턴스별로 고정값을 가져야하는 경우
	final String name; // 이런 형식의 인스턴스필드는 생성자에서 값을받아야된다. 
	// public Earth() {} // 클래스내부에 파이널이 선언되어있다면, 반드시 생성자에서 파이널에서 값을 할당해주겠다는 선언이라 안 해주면 오류난다.
	public Earth(String name) {
		this.name = name;
	}

}
