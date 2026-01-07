package com.yedam.java.ch1202.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		
		// Stream API
		// 컬랙션 생성시 사용하는 정적 메서드 : Data를 한꺼번에 집어넣은상태로 일괄 컬렉션으로 만들어주는 메서드
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Stream을 이용해서 공간을 열게되면 (컬렉션, 배열 등의)Data 소스로 부터 데이터를 받아와서 
		// 원하는 형태로 가공하거나 필터링할 수 있는 기능을 제공
		// Stream API로 연속적인 연산이가능 해당변수를통해 연속적으로 가지고올수있는 공간을 만든다.
		// Lambda 식을통해서 데이터를 가공
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		evenNumbers.stream().forEach(System.out::println);
		

	}

	public static void action(Calculable cb) {
		int x = 10;
		int y = 4;
		cb.calculate(x, y);
	}
}
