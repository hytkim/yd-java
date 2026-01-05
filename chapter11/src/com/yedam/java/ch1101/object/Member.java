package com.yedam.java.ch1101.object;

public class Member{
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 동일한 아이디를 가진 경우 '같다'로 결정
	// 참조타입을 동등비교(==)하는 경우 메모리주소를 비교
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	// 아이디를 Map 의 Key 로 설정하기 위해 추가 : 이걸써서 .get메서드로 비교할때 id 필드의 주소를기반으로 비교를 침
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	// 가장 대표적인 직렬화 메서드
	@Override
	public String toString() { 
		return "Member - id : "+this.id;
	}
	
	
}