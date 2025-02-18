package com.ktdsuniversity.edu.fp.stream.map;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import java.util.ArrayList;
import java.util.List;

public class DishStream {
	
	public void printStringToInteger() {
		// 각 문자들을 숫자로 바꿔서 출력, 사이에 문자가 껴있는 건 출력 안됨
		List<String> numberStringList = List.of("100", "20S0", "5", "1s1", "22", "7");
		numberStringList.stream() // Stream<String>
						.filter((str) -> str != null)
//							.peek((str) -> System.out.println("Before map: " + str.getClass()))
						.filter((str) -> str.matches("^[0-9]+$")) // Stream<String>
						.map((str) -> Integer.parseInt(str)) // Stream<Integer>
//					=> =.map(Integer::parseInt) // Stream<Integer>
//							.peek((number) -> System.out.println("After map: " + number.getClass()))
						.forEach((number) -> System.out.println(number));
//					=> =.forEach(System.out::println);
	}
	
	public void printStringAppendLowerCase() {
		System.out.println("=".repeat(30));
		//
		List<String> letterList = new ArrayList<>();
		// 65 ~ 90 => A ~ Z
		for(int i = 65; i < 91; i++) {
			letterList.add(((char) i) + "");
		}
		
		// letterList [A, B, C, D, E, F,..., X, Y, Z]
		// letterList [Aa, Bb, Cc, Dd, Ee, Ff,..., Xx, Yy, Zz]
		// 1. +
		// 2. toLowerCase: "A".toLowerCase() => "a"
		letterList.stream() // Stream<String>
//					.peek((str) -> System.out.println("Before map: " + str))
				  .map((str) -> str + str.toLowerCase())
//				  	.peek((str) -> System.out.println("After map: " + str))
				  .forEach(System.out::println);
//			  => =.forEach((str) -> System.out.println(str));
	}

	public void printOddLetters() {
		System.out.println("=".repeat(30));
		//
		List<String> letterList = new ArrayList<>();
		// 65 ~ 90 => A ~ Z
		for(int i = 65; i < 91; i++) {
			// 'A' + "" => "A"
			letterList.add(((char) i) + "");
		}
		
		// "A" => 65
		String a1 = "A";
		int ascii = a1.charAt(0);
		System.out.println(ascii);
		
		// 65 => "A"
		int num = 65;
		String a2 = ((char) num) + "";
		System.out.println(a2);
		// letterList [A, B, C, D, E, F,..., X, Y, Z]
		// 각 ascii가 홀수인 것만 출력
		// A1. 각 문자열들을 ascii로 변경 --- A => 65
		// A2. ascii가 홀수인 것만 추려내서 --- 65,67,...,89,91
		// A3. ascii를 문자열로 변경 --- 65 => A ===> A, C, E,..., U, W, Y
		// A4. 출력
		
		System.out.println("=".repeat(30));
		
		letterList.stream()
//					.peek((str) -> System.out.println("Before map: " + str))
				  .map((str) -> str.charAt(0) + 0) // Stream<Integer> // A1
//				  	.peek((str) -> System.out.println("After1 map: " + str))
				  .filter((asciiCode) -> asciiCode % 2 == 1) // Stream<Integer> // A2, A3
//				  	.peek((asciiCode) -> System.out.println("After2 map: " + asciiCode))
//				  	.peek((str) -> System.out.println("After2 map: " + str))
				  .map((asciiCode) -> ((char) asciiCode.intValue()) + "")
				  .forEach((str) -> System.out.println(str)); // A4
		
	}
	
	public void printDishesType() {
		System.out.println("=".repeat(30));
		/*
		* Dish
		* 	- name: String
		* 	- vegeterian: boolean
		* 	- calories: int
		* 	- type: Type
		* 
		* Stream<Dish> => Stream<Type> => 출력
		*/
		
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
//				.map((dish) -> dish.getType()) // Stream<Type>
//				.forEach((dish) -> System.out.println(dish));
				.map(Dish::getType) // Stream<Type>
				.forEach((type) -> System.out.println(type));
		
	}
	
	public void printDishesTypeDistinct() {
		System.out.println("=".repeat(30));
		
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
				.map((dish) -> dish.getType()) // Stream<Type>
				.distinct() // Stream<Type>
//				.forEach((dish) -> System.out.println(dish));
				.forEach(System.out::println);
	}
	
	public void printDishesCalories() {
		System.out.println("=".repeat(30));
		/*
		* Dish
		* 	- name: String
		* 	- vegeterian: boolean
		* 	- calories: int
		* 	- type: Type
		* 
		* Stream<Dish> => Stream<Integer: 요리의 칼로리> => 출력
		*/
		
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
				.map(dish -> dish.getCalories()) // input이 하나일 때 (dish)에서 괄호 생략 가능 // Stream<Integer>
				.forEach((cal) -> System.out.println(cal));
//				.map(Dish::getCalories) // Stream<Integer>
//				.forEach((cal) -> System.out.println(cal));
	}

	public void printDishesCaloriesDistinct() {
		System.out.println("=".repeat(30));
		
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
				.map((dish) -> dish.getCalories()) // Stream<Integer>
				.distinct() // Stream<Integer>
//				.forEach((cal) -> System.out.println(cal));
				.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		ds.printStringToInteger();
		ds.printStringAppendLowerCase();
		ds.printOddLetters();
		ds.printDishesType();
		ds.printDishesTypeDistinct();
		ds.printDishesCalories();
		ds.printDishesCaloriesDistinct();
	}

}
