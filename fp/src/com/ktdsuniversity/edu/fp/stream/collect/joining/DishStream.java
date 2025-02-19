package com.ktdsuniversity.edu.fp.stream.collect.joining;

import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;
import java.util.stream.Collectors;

public class DishStream {
	
	public String getOtherDishes() {
		// "프렌치 프라이, 쌀밥, 계절 과일, 피자" 반환시키기
		String otherDishes = DishList.get() // List<Dish>
				.stream() // Stream<Dish>
				.filter(dish -> dish.getType() == Type.OTHER) // Stream<Dish>
				.map(dish -> dish.getName()) // Stream<String>
				.collect(Collectors.joining(", ")) // String
				;
		return otherDishes;
	}
	
	public String getLowFatDishes() {
		// 400칼로리 이하의 음식들의 이름을 " - "로 구분해서 하나의 문자열로 만들기
		String lowFatDishes = DishList.get() // List<dish>
									  .stream() // Stream<Dish>
									  .filter(dish -> dish.getCalories() <= 400) // Stream<Dish>
									  .map(dish -> dish.getName()) // Stream<String>
									  .collect(Collectors.joining(" - ")) // String
									  ;
		return lowFatDishes;
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		String names1 = ds.getOtherDishes();
		String names2 = ds.getLowFatDishes();
		System.out.println(names1);
		System.out.println("=".repeat(30));
		System.out.println(names2);
	}
}
