package com.yedam.java.ch1401.charater;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader rd = new FileReader("C:/Temp/test3.txt");
		char[] buffer;
		while(true) {
			buffer = new char[10];
			int readCharNum = rd.read(buffer);
			if (readCharNum == -1)
				break;
			String str = new String(buffer);
			System.out.println(str);
		}
		rd.close();

	}

}
