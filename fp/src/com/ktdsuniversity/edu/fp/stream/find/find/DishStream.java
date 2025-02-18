package com.ktdsuniversity.edu.fp.stream.find.find;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;
import java.util.Optional;

public class DishStream {
	
	public void findAny() {
		// 육류 중 4개는 건너뛰고 5개를 가져와서 그 중 아무 거나(육류 중) 가져오기
		Optional<Dish> anyDishOfMeat1 = DishList.get() // List<dish>
												   .stream() // Stream<Dish>
												   .filter(dish -> dish.getType() == Type.MEAT) // Stream<Dish>
												   .skip(4) // Stream<Dish>
												   .limit(5) // Stream<Dish>
												   .findAny() // Optional<Dish>
												   ;
		System.out.println(anyDishOfMeat1); // Optional.Empty
		
		// 데이터가 없을 땐(Empty) 이렇게
		if (anyDishOfMeat1.isPresent()) {
			String antDishOfMeat1Name = anyDishOfMeat1.get()
													.getName();
			System.out.println(antDishOfMeat1Name);
		}
		
		// 데이터가 없을 때(Empty) 기본값으로 출력
		Dish anyDishOfMeat1OrDefault = anyDishOfMeat1.orElse(new Dish("그런 거 없습니다.", false, 0, null));
		System.out.println(anyDishOfMeat1OrDefault);
		
		// 육류 중 아무 거나 가져오기
		Optional<Dish> anyDishOfMeat2 = DishList.get() // List<dish>
												   .stream() // Stream<Dish>
												   .findAny() // Optional<Dish>
												   ;
		
		String dishName = anyDishOfMeat2.get() // Dish
										.getName(); // String
		System.out.println(dishName + "입니다.");
		
		
		// 실무에서는 이렇게 한다고 함
		Dish anyDishOfMeat3 = DishList.get() // List<dish>
									  .stream() // Stream<Dish>
									  .filter(dish -> dish.getType() == Type.MEAT) // Stream<Dish>
									  .skip(4) // Stream<Dish>
									  .limit(5) // Stream<Dish>
									  .findAny() // Optional<Dish>
									  .orElse(null) // Dish
									  ;
		if (anyDishOfMeat3 != null) {
			System.out.println(anyDishOfMeat3);
		}
	}
	
	public void findFirst() {
		System.out.println();
		
		Dish firstDish = DishList.get() // List<Dish>
								 .stream() // Stream<Dish>
								 .findFirst() // Optional<dish>
								 .orElse(null) // Dish
								 ;
		System.out.println(firstDish);
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		ds.findAny();
		ds.findFirst();
	}
}
