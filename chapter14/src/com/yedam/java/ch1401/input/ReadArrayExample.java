package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadArrayExample {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileInputStream is = new FileInputStream("C:/Temp/test2.db"); 
		byte[] buffer = null;
		
		while(true) {
			buffer = new byte[4]; // 이전 값을 초기화 안 해서 중복된값이 나올수있으니까 배열초기화를 여기서해줌
			int readByteNum = is.read(buffer);
			if (readByteNum == -1) 
				break;
			for (byte b : buffer) {
				System.out.printf("%d ",b);
			}
			System.out.println();
		}
		is.close();

	}

}
