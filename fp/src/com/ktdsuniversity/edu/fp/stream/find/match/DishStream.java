package com.ktdsuniversity.edu.fp.stream.find.match;

import com.ktdsuniversity.edu.fp.stream.data.Dish;
import com.ktdsuniversity.edu.fp.stream.data.DishList;
import com.ktdsuniversity.edu.fp.stream.data.Type;

public class DishStream {
	
	public void anyMatch() {
		// 채식이 있는지 확인
		boolean haveVegeterian = DishList.get()
										 .stream()
//										 .anyMatch(dish -> dish.getIsVegetarian())
										 .anyMatch(Dish::getIsVegetarian)
										 ;
		if (haveVegeterian) {
			System.out.println("채식이 존재합니다.");
		}
		// 육류 중 칼로리가 300 미만인 것이 있는지 확인
		boolean haveLowCalroryMeat = DishList.get()
											 .stream()
											 .anyMatch(dish -> dish.getCalories() < 300)
											 ;
		if (haveLowCalroryMeat) {
			System.out.println("300칼로리 미만의 육류가 존재합니다.");
		}
	}
	
	public void allMatch() {
		// 모든 요리가 채식인지 확인
		boolean areVegeterian = DishList.get()
										.stream()
										.allMatch(dishes -> dishes.getIsVegetarian())
										;
		if (areVegeterian) {
			System.out.println("모든 요리가 채식입니다.");
		}
		else {
			System.out.println("모든 요리가 채식인 건 아닙니다.");
			
		}
		
		// 모든 수산물류의 칼로리가 500 미만인지 확인
		boolean areLowCaloryFish = DishList.get()
										   .stream()
										   .filter(dishes -> dishes.getType() == Type.FISH)
										   .allMatch(fishesCal -> fishesCal.getCalories() < 500)
										   ;
		if (areLowCaloryFish) {
			System.out.println("모든 수산물류의 칼로리가 500 미만입니다.");
		}
		else {
			System.out.println("모든 수산물류의 칼로리가 500 미만인 건 아닙니다.");
		}
		
		// 모든 수산물류의 칼로리가 500 이상인지 확인
		
		
	}

	public void noneMatch() {
		// 육류 중 채식이 없는지 확인
		
		
	}
	
	public static void main(String[] args) {
		DishStream ds = new DishStream();
		ds.anyMatch();
		ds.allMatch();
		ds.noneMatch();
	}
}
