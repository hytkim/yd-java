package com.yedam.java.ch1401.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// throws FileNotFoundException 경로가 잘못되거나 파일이 없을경우의 예외처리가 필요함
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");// 기존의 Data 덮어쓰는거 주의!
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a); // 파일을 읽고 쓸때는 반드시 입출력예외에대한 처리가 필요하다
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}
}
