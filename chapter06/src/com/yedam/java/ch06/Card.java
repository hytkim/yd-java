package com.yedam.java.ch06;

// 라이브러리 클래스 || API 클래스( 이 표현은 잘 안 씀 )
public class Card {
	// [필드]
	// 카드종류 : 마스터, 비자, 국내용
	String type;
	// 카드사   : KB, 신한, 카카오, 삼성, 현대, 하나 ...
	String company;
	// 카드번호
	String cardNo;
	// 유효기간 : 년/월
	String period;
	// CVC
	int cvc;
	// 사용자 이름
	String userName;
	// 결제대금
	int amount = 0;
	// 교통대금
	int tranportAmount = 0;
	
	// 생성자
	Card(String cardNo, String period, int cvc, String userName) {
		this.type     = "마스터";
		this.company  = "삼성";
		this.cardNo   = cardNo;
		this.period   = period;
		this.cvc      = cvc;
		this.userName = userName;
	}
	
	
	// Method
	// 결재
	void payment(int price) {
		this.amount += price;
	}
	// 지급
	void bill () {
		this.amount = 0;
	}
	
	// 교통카드
	void transport(String type) {
		if (type.equals("버스")) {
			this.tranportAmount += 1500;
		}else {
			this.tranportAmount += 2000;
		}
	}
	
}