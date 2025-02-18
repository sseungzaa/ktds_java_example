package com.ktdsuniversity.edu.fp.builtin;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExam {
	
	public static void main(String[] args) {
		
		Consumer<String> con1 = (str) -> {
			System.out.println(str);
		};
		con1.accept("반갑습니다."); // 반갑습니다.
		
		Consumer<String> con2 = (str) -> System.out.println(str);
		con2.accept("만나서 반갑습니다."); // 만나서 반갑습니다.
		
		
		List<Integer> numArr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// for문이나 if문을 쓰지 않고 반복시킴
		numArr.forEach((num) -> System.out.println("반복 중입니다. " + num)); // 반복 중입니다. 1 x 10
	}
}
