package com.yedam.java.check.ch0604_03;

public class MemberService {
	// field 에 선언한다는것은 어떻게보면 DB에 있는값처럼 취급하겠다는건데 상수선언 아직 안 배웠으니까 지금 필드로쓰는것은 의미가 없다.
	boolean login(String id, String password) {
		return id.equals("hong") && password.equals("12345") ? true : false;
	}
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println(id + "로그아웃 되었습니다.");
		}
	}
}
