package com.yedam.java.ch1202.lambda;

public class CalculableExample {

	public static void main(String[] args) {
		// 람다식을 작성하는 기본 형태
		Calculable test = (a, b) -> 
		{ int res = a + b; System.out.println("result : "+ res); };
		test.calculate(100, 25);
		
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int res = x - y;
				System.out.println("result : "+ res);
			}
		});

	}
	public static void action(Calculable cb) {
		int x = 10; int y = 4;
		cb.calculate(x, y);
	}

}
