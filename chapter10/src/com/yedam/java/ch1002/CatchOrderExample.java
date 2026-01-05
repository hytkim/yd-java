package com.yedam.java.ch1002;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);			
		} catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(RuntimeException e) {
			e.printStackTrace();
		} 
//		catch(ClassNotFoundException e) {	e.printStackTrace(); } //여기서 터지는건 이 예외가 절대 안터질 try블럭이라서 그럼 
		catch (Exception e) { System.out.println("몰?루는 예외");
		} finally {
			System.out.println("재실행 레쓰고");
		}
	}

}