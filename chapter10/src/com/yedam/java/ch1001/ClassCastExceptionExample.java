package com.yedam.java.ch1001;

public class ClassCastExceptionExample {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); // 실행블럭에서 체크하기때문에 가장먼저 발생한예외는 10으로뜬다.
		
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;			
		}
	}

}

class Animal{}
class Dog extends Animal{};
class Cat extends Animal{};