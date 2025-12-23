package com.yedam.java.ch0302;

public class IncreaseDecreaseOpratorExample {

	public static void main(String[] args) {
		// 단항) 증감연산자(++/--)
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("-------------------------------");
		x++; // 11
		++x; // 11 => 11 + 1
		System.out.println("x = " + x); // 12

		System.out.println("-------------------------------");
		
		y--; // 9
		--y; // 9 => 9 - 1
		System.out.println("y = " + y); // 8
		
		System.out.println("-------------------------------");
		z = x++;
		System.out.println("z = "+z); // 12
		System.out.println("x = "+x); // 13

		System.out.println("-------------------------------");
		z = ++x + y++; // 14 + 8, 8 => 8+1
		System.out.println("z = " + z); // 22
		System.out.println("x = " + x); // 14
		System.out.println("y = " + y); // 9
	}

}
