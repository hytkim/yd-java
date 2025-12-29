package com.yedam.java.ch0605;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); // The constructor Singleton() is not visible
		Singleton obj1 = Singleton.getInstatnce();
		Singleton obj2 = Singleton.getInstatnce();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		
		if (obj1 == obj2) {
			System.out.println("동일한 주소값을 참조하고있는 참조타입 변수입니다.");
		}

	}

}
