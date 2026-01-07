package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream us = new FileInputStream("C:/Temp/test1.db");
		
		// 파일 얼마나큰지 모르니까 while 문 기반으로 한다.
		while(true) {
			int data = us.read();
			if(data == -1) break;
			System.out.println(data);
		}
		
		us.close();

	}

}
