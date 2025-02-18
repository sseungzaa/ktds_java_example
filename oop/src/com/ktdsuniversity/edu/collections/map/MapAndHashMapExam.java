package com.ktdsuniversity.edu.collections.map;

import java.util.Map;
import java.util.HashMap; // 순서 랜덤
import java.util.LinkedHashMap; // 적은 순서대로
import java.util.TreeMap; // 오름차순 정렬

public class MapAndHashMapExam {
	
	public static void main(String[] args) {
		System.out.println("----------put(Map에 데이터 추가)----------");
		Map<String, Integer> priceMap1 = new HashMap<>();
		
		priceMap1.put("맥북", 270);
		priceMap1.put("갤럭시북", 180);
		priceMap1.put("그램", 130);
		
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		
		priceMap1.put("그램", 150);
		
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		System.out.println("-> 새로 추가한 (그램, 150)으로 데이터가 바뀜");
		
		priceMap1.put("씽크패드", 120);
		
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		System.out.println("-> 새로 추가한 (씽크패드, 120)이라는 데이터가 추가됨");
		System.out.println("  -> *put의 쓰임 - 데이터가 없다면 입력한 걸로 추가해주고, 데이터가 있다면 입력한 걸로 바꿔줌");
		
		
		System.out.println("\n----------get(Map 데이터 조회)----------");
		int applePrice = priceMap1.get("맥북");
		System.out.print("조회한 '맥북'이라는 Key(키)의 Value(값): ");
		System.out.println(applePrice);
		
//		applePrice = priceMap1.get("멕북"); // java.lang.NullPointerException
//		System.out.println(applePrice);
		
		
		System.out.println("\n----------remove(Map 데이터 삭제)----------");
		System.out.println("--remove 실행 전--");
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		
		priceMap1.remove("씽크패드");
		
		System.out.println("--'씽크패드' remove 실행 후--");
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		
		
		System.out.println("\n----------clear(Map 데이터 모두 삭제)----------");
		System.out.println("--clear 실행 전--");
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		
		priceMap1.clear();
		
		System.out.println("--clear 실행 후--");
		System.out.print("맵: ");
		System.out.println(priceMap1);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap1.size());
		
		
		System.out.println("\n----------isEmpty(Map이 비어 있는지 확인)----------");
		Map<String, Integer> priceMap2 = new LinkedHashMap<>();
		
		priceMap2.put("맥북", 270);
		priceMap2.put("갤럭시북", 180);
		priceMap2.put("그램", 130);
		
		System.out.println("--clear 실행 전--");
		System.out.print("맵 내부가 비었는지 여부: ");
		System.out.println(priceMap2.isEmpty());
		System.out.print("맵: ");
		System.out.println(priceMap2);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap2.size());
		
		priceMap2.clear();
		
		System.out.println("--clear 실행 후--");
		System.out.print("맵 내부가 비었는지 여부: ");
		System.out.println(priceMap2.isEmpty());
		System.out.print("맵: ");
		System.out.println(priceMap2);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap2.size());
		
		
		System.out.println("\n----------containsKey(Map 내 동일한 Key(키) 존재 여부 확인)----------");
		Map<String, Integer> priceMap3 = new TreeMap<>();
		
		priceMap3.put("맥북", 270);
		priceMap3.put("갤럭시북", 180);
		priceMap3.put("그램", 130);
		
		System.out.print("맵: ");
		System.out.println(priceMap3);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap3.size());
		
		if (!priceMap3.containsKey("그램")) {
			priceMap3.put("그램", 150);
		}
		
		System.out.print("맵: ");
		System.out.println(priceMap3);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap3.size());
		System.out.println("-> '그램'이라는 키의 존재 여부를 확인했는데 이미 '그램'이라는 키가 존재하기 때문에 아무 변화도 일어나지 않음(150으로 바뀌는 거 아님!)");
		
		if (!priceMap3.containsKey("씽크패드")) {
			priceMap3.put("씽크패드", 120);
		}
		
		System.out.print("맵: ");
		System.out.println(priceMap3);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap3.size());
		System.out.println("-> '씽크패드'라는 키의 존재 여부를 확인했는데 '씽크패드'라는 키가 존재하지 않기 때문에 (씽크패드, 120)이라는 데이터가 추가됨");
		
		
		System.out.println("\n----------putAll(Map 복사)----------");
		Map<String, Integer> priceMap4 = new HashMap<>();
		
		priceMap4.putAll(priceMap3);
		
		// 객체 고유 값(메모리 주소)
		System.out.print("객체 고유 값(메모리 주소): ");
		System.out.println(System.identityHashCode(priceMap3));
		System.out.print("맵: ");
		System.out.println(priceMap3);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap3.size());
		
		// 객체 고유 값(메모리 주소)
		System.out.print("객체 고유 값(메모리 주소): ");
		System.out.println(System.identityHashCode(priceMap4));
		System.out.print("맵: ");
		System.out.println(priceMap4);
		System.out.print("맵 내 데이터의 개수: ");
		System.out.println(priceMap4.size());
	}
}
