package com.ktdsuniversity.edu.fp.stream.collect.tolist;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;
import java.util.List;
import java.util.stream.Collectors;

public class DishStream {
	
	public List<String> getOtherDishes() {
		List<String> otherDishes = DishList.get() // List<Dish>
										   .stream() // Stream<Dish>
										   .filter(dish -> dish.getType() == Type.OTHER) // Stream<Dish>
										   .map(dish -> dish.getName()) // Stream<String>
//										   .collect(Collectors.toList()) // List<String> // 사용 중인 Java의 버전이 15 이하일 때 사용
										   .toList() // List<String> // Java 16 이상에서만 사용 가능
										   ;
		return otherDishes;
	}
	
	public List<Dish> getLowFatDishes() {
		List<Dish> lowFatDishes = DishList.get() // List<dish>
											.stream() // Stream<Dish>
											.filter(dish -> dish.getCalories() <= 400) // Stream<Dish>
											.collect(Collectors.toList()) // List<Dish>
//											.toList() // List<Dish>
											;
		return lowFatDishes;
	}
	
	public List<Dish> getMenuWithoutFishType() {
		// Type.Fish의 요리만 제외하고 모두 리스트로 변환해 반환시키기
		List<Dish> menuWithoutFish = DishList.get() // List<dish>
											 .stream() // Stream<Dish>
											 .filter(dish -> dish.getType() != Type.FISH) // Stream<Dish>
											 .toList() // List<Dish>
											 ;
		return menuWithoutFish;
	}
	
	public List<String> getVegetableAndMeatMenu() {
		//  Vetetable, Type.FISH의 이름만 리스트로 변환해 반환시키기
		List<String> vegetableAndMeat = DishList.get()
												.stream()
												.filter(dish -> dish.getIsVegetarian() || dish.getType() == Type.FISH)
												.map(dish -> dish.getName())
												.toList()
												;
		return vegetableAndMeat;
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		List<String> names1 = ds.getOtherDishes();
		names1.forEach(name -> System.out.println(name));
		
		System.out.println("=".repeat(30));
		
		List<Dish> names2 = ds.getLowFatDishes();
		names2.forEach(dish -> {
			System.out.print(dish.getName() + " / ");
			System.out.print(dish.getCalories() + " / ");
			System.out.print(dish.getIsVegetarian() + " / ");
			System.out.println(dish.getType());
		});
		
		System.out.println("=".repeat(30));
		
		List<Dish> names3 = ds.getMenuWithoutFishType();
		System.out.println(names3);
		
		System.out.println("=".repeat(30));
		
		List<String> names4 = ds.getVegetableAndMeatMenu();
		System.out.println(names4);
	}
}
