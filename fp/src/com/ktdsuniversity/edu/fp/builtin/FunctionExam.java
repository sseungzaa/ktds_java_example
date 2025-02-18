package com.ktdsuniversity.edu.fp.builtin;

import java.util.Arrays;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Map;

public class FunctionExam {
	
	public static void main(String[] args) {
		
		// Function<인풋 제네릭, 아웃풋 제네릭>
		Function<String, String> fn1 = (str) -> str + "?";
		
		String result1 = fn1.apply("안녕하세요");
		System.out.println(result1); // 안녕하세요?
		
		result1 = fn1.apply("반갑습니다");
		System.out.println(result1); // 반갑습니다?
		
		
		// "안녕하세요?" -> 6
		// "반갑습니다. 안녕하세요?" -> 13
		// 문자열을 보내면 정수형으로 문자열의 길이를 반환하는 함수 만들기
		// int의 레퍼런스 타입 Integer!!!
		Function<String, Integer> fn2 = (str) -> str.length();
		int result2 = fn2.apply("안녕하세요?");
		System.out.println(result2); // 6
		
		result2 = fn2.apply("반갑습니다. 안녕하세요?");
		System.out.println(result2); // 13
		
		// "지금은 함수형 프로그래밍을 배우고 있습니다."
		// -> ["지금은","함수형","프로그래밍을","배우고","있습니다."]
		// 문자열을 보내면 " "로 문자열을 잘라 문자열 배열을 반환하는 함수 만들기
		Function<String, String[]> fn3 = (str) -> str.split(" ");
		String[] result3 = fn3.apply("지금은 함수형 프로그래밍을 배우고 있습니다.");
		System.out.println(Arrays.toString(result3)); // [지금은, 함수형, 프로그래밍을, 배우고, 있습니다.]
		
		Map<String, Integer> valueMap = new HashMap<>();
		valueMap.put("A", (int)'A');
		valueMap.put("B", (int)'B');
		valueMap.put("C", (int)'C');
		valueMap.put("D", (int)'D');
		valueMap.put("E", (int)'E');
		System.out.println(valueMap); // {A=65, B=66, C=67, D=68, E=69}
		
		valueMap.replaceAll((key, value) -> value * 2);
		
		System.out.println(valueMap); // {A=130, B=132, C=134, D=136, E=138}
	}
}
