package com.ktdsuniversity.edu.collections.set;

import java.util.Set;
import java.util.HashSet;

public class SetAndHashSetExam {
	
	public static void main(String[] args) {
		System.out.println("----------add(Set에 데이터 추가)----------");
		Set<Integer> numbers1 = new HashSet<>();
		
		numbers1.add(10);
		numbers1.add(20);
		numbers1.add(10);
		numbers1.add(30);
		
		System.out.println(numbers1);
		System.out.println(numbers1.size());
	}
}
