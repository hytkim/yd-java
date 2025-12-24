package com.yedam.java.ch06;

// 실행클래스 : main Method 를 가진 클래스
public class MainExample {
	
	public static void main(String[] args) {
		// 실행클래스 : MainExample 이름으로고정하겠따
		// 실제 발급을 한 상황 : 클래스 => 인스턴스 생성
		Card hong = new Card("12345678", "27-07", 777, "hong");
		Card kang = new Card("87654321", "30-12", 753, "kang");
		// hong => 버스타고 점심먹고 커피까지 땡김
		hong.transport("버스");
		hong.payment(15000);
		hong.payment(4500);
		
		// kang => 지하철타고 
		kang.transport("지하철");
		kang.payment(32000);
		
		System.out.println("hong  pay: " + hong.amount);
		System.out.println("hong tpay: " + hong.tranportAmount);
		System.out.println("hong card: " + hong.cardNo);
		System.out.println();
		
		System.out.println("kang : " + kang.amount);
		System.out.println("kang tpay: " + kang.tranportAmount);
		System.out.println("kang card: " + kang.cardNo);
		
	}
	
}