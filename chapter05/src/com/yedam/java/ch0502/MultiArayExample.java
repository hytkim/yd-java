package com.yedam.java.ch0502;

import java.util.Iterator;

public class MultiArayExample {

	public static void main(String[] args) {// 실행할때 받아오는 알규먼츠 배열인데
		// 다차원배열 => 참조타입배열
		String[] strAray = {"신용권", "이자바"}; // 메모리사용방식이 이 방식과 동일하다.
		for(String text :strAray) {
			System.out.println("text : " + text);
		}
		
		// 2차원배열
		int[][] intAray = null;
		intAray = new int[][] { {1,2}, {3,4,5} };
		
		for (int[] is1 : intAray) {
			for (int is2 : is1) {
				System.out.println("is1 : " + is1 + " : is 2 : "+ is2);
			}
		}
		
		intAray = new int[2][];
		intAray[0] = new int[] {1,2};
		intAray[1] = new int[] {3,4,5};
		
		
	}

}
