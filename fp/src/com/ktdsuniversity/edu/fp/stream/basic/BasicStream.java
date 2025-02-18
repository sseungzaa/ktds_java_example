package com.ktdsuniversity.edu.fp.stream.basic;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {
	
	public void printMenuStream() {
		// 1. 요리 목록을 가져옴
		List<Dish> menuList = DishList.get();
		
		// 2. stream을 이용해 출력
		// 2-1. List<Dish>를 Stream<Dish>로 변경
		// 	Stream = 내부 반복자 / Stream 내부에서 모든 반복이 이루어짐
		// 						Stream 외부에서는 반복을 할 때마다 처리해야 하는 함수만 전달
		// Stream을 통해 Predicate, Function, Consumer 함수를 사용
		Stream<Dish> menuStream = menuList.stream();
		
		// 2-2. Stream의 내용을 반복하며 출력
		menuStream.forEach((eachDish1) -> System.out.println("In Stream1: " + eachDish1));
		
		// TO-BE (앞으로는 이렇게 쓰자) (Stream은 이렇게 쓰는 거다ㅇㅇ)
		// 직렬 처리
		menuList.stream() // -> Stream<Dish>
				.forEach((eachDish2) -> System.out.println("In Stream2: " + eachDish2)); // void
		
		// 병렬 처리
		menuList.parallelStream()
				.forEach((eachDish3) -> System.out.println("In Stream3: " + eachDish3));
	}
	
	public void printMenuNotStream() {
		// 1. 요리 목록을 가져옴
		List<Dish> menuList = DishList.get();
		
		// 2. for-each를 이용해 출력
		for (Dish eachMenu : menuList) {
			System.out.println(eachMenu);
		}
	}
	
	
	
	public void run() {
		System.out.println("=".repeat(30));
		// Stream은 최종 연산 없이는 동작되지 않음
		DishList.get()
				.stream()
				.peek(dish -> System.out.println("최종 연산 없는 스트림: " + dish))
				.filter(dish -> dish.getIsVegetarian())
				;
		
		long count = DishList.get()
							 .stream()
							 .peek(dish -> System.out.println("최종 연산 없는 스트림: " + dish))
							 .filter(dish -> dish.getIsVegetarian())
							 .count() // 최종 연산 long 반환
							 ;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		BasicStream bs = new BasicStream();
		bs.printMenuStream();
		bs.printMenuNotStream();
		bs.run();
	}
}
