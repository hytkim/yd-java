package com.yedam.java.ch1401.charater;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		
		String message = "Hello, Wolrd!!\n 오늘은 수! 요! 일.";
		writer.write(message);
		
		writer.flush();
		writer.close();

	}

}
