package com.yedam.java.ch1401.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteArrayExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		OutputStream os = new FileOutputStream("C:Temp/test2.db");
		byte[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		os.write(array);
		
		os.flush();
		os.close();
	}

}
