package com.ktdsuniversity.edu.fp.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isOdd = (number) -> number % 2 == 1;
		boolean result = isOdd.test(123);
		System.out.println("123은 홀수인가?: " + result); // true
		
		
		List<Integer> numArr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> mutableArr = new ArrayList<>(numArr);
		System.out.println(mutableArr); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		// 각 element의 값이 5보다 작거나 같으면 지움
		mutableArr.removeIf((element) -> element <= 5);
		System.out.println(mutableArr); // [6, 7, 8, 9, 10]
		
	}
}
