package com.ktdsuniversity.edu.fp.stream.filter;

import com.ktdsuniversity.edu.fp.stream.data.DishList;

public class DishStream {
	
	public void printVegeterian() {
		// Stream => 내부 반복자=직접 반복을 시키지 않음 => 스트림 내부에서 반복을 진행함
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
//					.peek((eachDish) -> System.out.println("Before filter: " + eachDish.getName() + " / " + eachDish.getIsVegetarian())) // Stream<Dish> // 지금 반복 중인 것이 무엇인지 관찰하는 디버깅용 함수
				.filter((eachDish) -> eachDish.getIsVegetarian()) // Stream<Dish>
//					.peek((eachDish) -> System.out.println("After filter: " + eachDish.getName() + " / " + eachDish.getIsVegetarian())) // peek은 디버깅용이라 디버깅만 해보고 지움
				.forEach((eachDish) -> System.out.println(eachDish)); // void
		
		/* 내부 반복
		* 1. .stream() 돼지고기 => vegeterian: false
		*    .filter() 돼지고기가 채식인가? (true냐 false냐)
		*    .forEach() 실행 안 함
		* 2. .stream() 소고기 => vegeterian: false
		*    .filter() 소고기가 채식인가? (true냐 false냐)
		*    .forEach() 실행 안 함
		* 3. .stream() 치킨 => vegeterian: false
		*    .filter() 치킨이 채식인가? (true냐 false냐)
		*    .forEach() 실행 안 함
		* 4. .stream() 프렌치 프라이 => vegeterian: true
		*    .filter() 프렌치 프라이가 채식인가? (true냐 false냐)
		*    .forEach() 실행 => 요리명 출력
		* 5. .stream() 쌀밥 => vegeterian: true
		*    .filter() 쌀밥이 채식인가? (true냐 false냐)
		*    .forEach() 실행 => 요리명 출력
		* 6. .stream() 계절 과일 => vegeterian: true
		*    .filter() 계절 과일이 채식인가? (true냐 false냐)
		*    .forEach() 실행 => 요리명 출력
		* 7. .stream() 피자 => vegeterian: true
		*    .filter() 피자가 채식인가? (true냐 false냐)
		*    .forEach() 실행 => 요리명 출력
		* 8. .stream() 새우 => vegeterian: false
		*    .filter() 새우가 채식인가? (true냐 false냐)
		*    .forEach() 실행 안 함
		* 9. .stream() 연어 => vegeterian: false
		*    .filter() 연어가 채식인가? (true냐 false냐)
		*    .forEach() 실행 안 함
		*/
	}
	
	public void printLowCaloryVegeterian() {
		DishList.get() // List<Dish>
				.stream() // Stream<Dish>
//					.peek((eachDish) -> System.out.println("Before filter: " + eachDish.getName() + " / " + eachDish.getIsVegetarian() + " / " + eachDish.getCalories()))
				.filter((eachDish) -> eachDish.getIsVegetarian()) // Stream<Dish>
//					.peek((eachDish) -> System.out.println("After filter1: " + eachDish.getName() + " / " + eachDish.getIsVegetarian() + " / " + eachDish.getCalories()))
				.filter((eachDish) -> eachDish.getCalories() < 300) // Stream<Dish> 300칼로리 미만의 음식만 걸러내기
//					.peek((eachDish) -> System.out.println("After filter2: " + eachDish.getName() + " / " + eachDish.getIsVegetarian() + " / " + eachDish.getCalories()))
				.forEach((eachDish) -> System.out.println(eachDish + " / " + eachDish.getCalories())); // Stream<Dish>
	}
	
	public static void main(String[] args) {
		
		DishStream ds= new DishStream();
		ds.printVegeterian();
		ds.printLowCaloryVegeterian();
	}
}
