package com.yedam.java.ch0502;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열복사
		int[] first = {1, 2, 3};
		// 1) 얕은복사
		int[] second = first;
		second[1] = 10;
		System.out.println("first[1] : "+first[1]);
		// 2) 깊은복사
		int[] third = new int[3];
		System.arraycopy(first, 0, third, 0, 3);
		
		third[1] = 1234;
		System.out.println("first[1] : "+first[1]);
		
		for (int i : third) {
			System.out.println("third : " + i);
		}
		
		int[] test = new int[2];
		System.arraycopy(first, 0, test, 0, 2);
		int cnt = 0;
		for (int i : test) {
			System.out.println("test[" + cnt + "] : "+ i);
			cnt ++;
		}

	}

}
