package com.yedam.java.ch1001;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		String data1 = args[0]; // args 배열의 length가 0이므로 index 0번째 요소는 args배열의 범위밖으로 벗어났다. 
		String data2 = args[1];
		
		System.out.println("args[0] : "+ data1);
		System.out.println("args[1] : "+ data2);

	}

}
