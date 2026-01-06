package com.yedam.java.ch1202.lambda;

public class ActionExample {

	public static void main(String[] args) {
		Action speaker = message -> {
			String presentation = message + "를 발표합니다.";
			System.out.println(presentation);
			};
		speaker.speak("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		
		speaker = message -> System.out.println(message);
		speaker.speak("ABC");
	}

}
