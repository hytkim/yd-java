package com.yedam.java.ch0501;

// Method 영역 : .class 파일의 모든 코드가 올라간다
// 최초 실행 시 Method 영역에 ReferenceCommonExample.class
// static void main () 
// static boolean firstMethode();
// 3가지 + JDK 클래스들이 적재됨
public class ReferenceCommonExample {

	// 최초 실행 시 stack 영역에 main 블럭{}이 올라감 
	public static void main(String[] args) {
		String msg = "Hello World";
		boolean result = firstMethod();
		
		System.out.println(msg);
		System.out.println("result : " + result);
		
	}
	
	// main 영역에서 함수가 호출되어 stack 영역에 firstMethod의 블럭{} 영역이 추가로 들어감
	public static boolean firstMethod() {
		char v1 = 'A';
		
		// firstMethod의 블럭{ }영역 내부에 { IF{ } } 
		if (v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		int v2 = 50; // stack  영역으로 완전히 분리되는 구조로 되어있기때문에, 같은메서드에서 동일한 이름의 변수를 만들어도 된다.
		boolean v4 = true;
		
		return v4; // 맞네 이렇게하면 이것은 'true' 라는 리터럴을 리턴하는거야? 아니면 v4라는 '메모리주소'를 리턴하는거야?
	}

}