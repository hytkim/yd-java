package com.yedam.java.ch1002;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			testException();
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch ( NullPointerException e) {
			e.printStackTrace();
		} catch(UserException e) {
			e.printStackTrace();
		}
	}
	
	public static void findClass() throws ClassNotFoundException, NullPointerException{
		Class clazz = Class.forName("java.lang.String2");
	}
	public static void testException() throws UserException{
		if (true) { // 직접 해당 예외가 발생할 상황을 정의
			throw new UserException("사용자 예외");
		}
	}

}
class UserException extends Exception{
	UserException(String msg){
		super(msg);
	}
}