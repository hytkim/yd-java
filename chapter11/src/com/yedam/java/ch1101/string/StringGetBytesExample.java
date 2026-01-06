package com.yedam.java.ch1101.string;

public class StringGetBytesExample {
	
	public static void main(String[] args) {
		String str ="안녕하세요";
		
		// 기본 문자셋(Character Set, "표준 UTF-8")으로 인코딩과 디코딩
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		try {
			// EUC-KR : 한글, 2byte로 표현
			// 한글을 저장하거나 변환을할때 기존에있는 문자셋을쓰는게아니라 내가 지정한 문자셋을쓰고싶다면 다 방법이 있다.
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes1.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			// 이거 깨지는데 인코딩 할때 사용한 문자셋정보를 디코딩할 bytes 배열과 함께 줘야한다.
			System.out.println("bytes1->String: "+str2);
			
//			System.out.println();
//			for (byte b : bytes2) {
//				System.out.println(b);
//			}
			// UTF-8  : 유니코드 => 표준 한글, 3byte로 표현 : 현재 이클립스설정을 UTF-8로 해 두었기때문에 자동으로 인코딩 디코딩이 되고있음
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes1.length: " + bytes3.length);
			String str3 = new String(bytes3);
			// 이거 깨지는데 인코딩 할때 사용한 문자셋정보를 디코딩할 bytes 배열과 함께 줘야한다.
			System.out.println("bytes1->String: "+str3);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println();
//		for (byte b : bytes1) {
//			System.out.println(b);
//		}

	}
	
}