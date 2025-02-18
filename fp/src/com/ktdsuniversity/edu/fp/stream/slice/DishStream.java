package com.ktdsuniversity.edu.fp.stream.slice;

import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {
	
	public void printMenuSkip(int skip) {
		// 프렌치 프라이, 쌀밥, 계절 과일, 피자, 새우, 연어 출력
		// 전체 스트림에서 skip만큼 건너뛰고 나머지를 출력
		DishList.get()
				.stream()
//				.peek((eachDish) -> System.out.println("Before skip: " + eachDish.getName()))
				.skip(skip)
//				.peek((eachDish) -> System.out.println("After skip: " + eachDish.getName()))
				.forEach((eachDish) -> System.out.println(eachDish));
	}
	
	public void printMenuLimit(int limit) {
		System.out.println("=".repeat(30));
		// 돼지고기, 소고기, 치킨, 프렌치 프라이 출력
		// 전체 스트림에서 limit만큼만 가져와 출력
		DishList.get()
		.stream()
//		.peek((eachDish) -> System.out.println("Before limit: " + eachDish.getName()))
		.limit(limit)
//		.peek((eachDish) -> System.out.println("After limit: " + eachDish.getName()))
		.forEach((eachDish) -> System.out.println(eachDish));
	}
	
	public void printMenuSkipAndLimit(int skip, int limit) {
		System.out.println("=".repeat(30));
		// 치킨, 프렌치 프라이, 쌀밥, 계절 과일, 피자 출력
		// 전체 스트림에서 skip만큼 건너뛰고 나머지에서 limit만큼만 가져와 출력
		DishList.get()
		.stream()
//		.peek((eachDish) -> System.out.println("Before skip&limit: " + eachDish.getName()))
		.skip(skip)
//		.peek((eachDish) -> System.out.println("After skip: " + eachDish.getName()))
		.limit(limit)
//		.peek((eachDish) -> System.out.println("After skip&limit: " + eachDish.getName()))
		.forEach((eachDish) -> System.out.println(eachDish));
	}
	
	public void printMenuLimitAndSkip(int limit, int skip) {
		System.out.println("=".repeat(30));
		// 치킨, 프렌치 프라이, 쌀밥 출력
		// 전체 스트림에서 limit만큼만 가져온 뒤 skip만큼 건너뛰고 나머지를 출력
		DishList.get()
		.stream()
//		.peek((eachDish) -> System.out.println("Before limit&skip: " + eachDish.getName()))
		.limit(limit)
//		.peek((eachDish) -> System.out.println("After limit: " + eachDish.getName()))
		.skip(skip)
//		.peek((eachDish) -> System.out.println("After limit&skip: " + eachDish.getName()))
		.forEach((eachDish) -> System.out.println(eachDish));
	}
	
	public void printMeatDishesLimit(int limit) {
		System.out.println("=".repeat(30));
		// 육류 음식만 limit만큼만 가져와 출력
		DishList.get()
		.stream()
		.filter((eachDish) -> eachDish.getType() == Type.MEAT)
		.limit(limit)
		.forEach((eachDish) -> System.out.println(eachDish));
	}
	
	public static void main(String[] args) {
		
		DishStream ds = new DishStream();
		
		ds.printMenuSkip(3); // 프렌치 프라이, 쌀밥, 계절 과일, 피자, 새우, 연어 출력
		ds.printMenuLimit(4); // 돼지고기, 소고기, 치킨, 프렌치 프라이 출력
		ds.printMenuSkipAndLimit(2, 5); // 치킨, 프렌치 프라이, 쌀밥, 계절 과일, 피자 출력
		ds.printMenuLimitAndSkip(5, 2); // 치킨, 프렌치 프라이, 쌀밥 출력
		
		ds.printMeatDishesLimit(1); // 돼지고기 출력
		ds.printMeatDishesLimit(2); // 돼지고기, 소고기 출력
		ds.printMeatDishesLimit(3); // 돼지고기, 소고기, 치킨 출력
	}
}
