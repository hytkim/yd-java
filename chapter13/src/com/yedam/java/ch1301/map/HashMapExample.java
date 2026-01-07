package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// <  Key ,  Value >
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : "+map.size());     // 3
		System.out.println("\t 홍길동: "+map.get("홍길동")); // 95
		System.out.println();
		
		// 전체 순환
		// 1) keySet : map이 가지고있는 Map.Entry 객체의 Key값들만을 가지고 Set을 만듦
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();    // 전통적인 방식
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.printf("\t%s : %d\n", key, value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+map.size());     // 2
		
		// 2) entrySet : map 이 가지고 있는 한 쌍(키,값)의 객체 Map.Entry 객체를가지고 Set을 만듦
		// entrySet 으로 entry 단위로하면 map의 key와 value를 한번에 전체 data를 가져올 수 있다, entry안쓰면 key찾고 value찾아야될수도있다. 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.printf("\t %s : %d \n", key, value);
		}

	}

}
