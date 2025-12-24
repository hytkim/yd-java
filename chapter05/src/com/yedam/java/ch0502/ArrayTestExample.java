package com.yedam.java.ch0502;

public class ArrayTestExample {

	public static void main(String[] args) {
		// Q1 : 1, 4, 9, 2, 5 중 max, min 구하기
		int[] ary1 = { 1, 4, 9, 2, 5 };
		int max = ary1[0];
		int min = ary1[0];
		for (int i = 0; i < ary1.length; i++) {
			int cur = ary1[i];
			if (cur > max)
				max = cur;
			if (cur < min)
				min = cur;
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);

	}

}
