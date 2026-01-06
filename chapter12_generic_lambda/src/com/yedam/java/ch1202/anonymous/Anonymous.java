package com.yedam.java.ch1202.anonymous;

// 익명구현객체를 활용
public class Anonymous {

	// Field
	// 스스로 생성자를 가지지 않기 때문에 인터페이스명으로 생성자를 대신한다
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV 켬");
		}

		@Override
		public void turnOff() {
			System.out.println("TV 끔");
		}
	};
	
	// Method 필드가아닌 메서드내부에서 선언하는 로컬변수로 많이쓴다
	// 익명구현객체는 재사용이 안되므로 1회성으로 사용된다
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio 끔");
			}
		};
		localVar.turnOn();
	}

	public void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
