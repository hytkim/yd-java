package com.yedam.java.ch1202.lambda;

public class CommonExample {

	public static void main(String[] args) {
		// 람다식 활용 => 콜백함수
		action((x,y) -> {
			int result = x + y;
			System.out.println("result : "+result);
		});
		// ** 2중 콜론(:) 연산자 = 메서드 참조에 사용 **
		action((x,y)-> Math.max(x, y)); 
		action(Math::max);

	}

	public static void action(Calculable cb) {
		int x = 10;
		int y = 4;
		cb.calculate(x, y);
	}
}
