package com.yedam.java.ch0801;

public class SmartTvExample {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		smartTv.turonOn();
		smartTv.setVolume(10);
		smartTv.search("Naver");
		smartTv.turnOff();
		System.out.println("-------------------------");
		// SmartTV = RemoteControl + Searchable + a | 참조타입 프로모션(자동 형 변환)이 가능한 자료형이 2가지다. 근데 이렇게쓰면 다중인터페이스 쓰는 의미가 없다.
		RemoteControl rc = smartTv;//Searchable + a 는 접근불가
		rc.turonOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable search = smartTv;//RemoteControl + a 는 접근불가
		search.search("교보문고");

	}
}
