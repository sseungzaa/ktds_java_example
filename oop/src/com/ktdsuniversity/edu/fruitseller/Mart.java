package com.ktdsuniversity.edu.fruitseller;

public class Mart {
	public static void main(String[] args) {
		FruitSeller coupang = new FruitSeller(100,1000);
		System.out.println("판매자 소지금: " + coupang.getMoney()); // 100
		System.out.println("과일 재고: " + coupang.getFruitStock()); // 1000
		
		coupang.sell(10); // money,fruitStock이 변경됨
		coupang.sell(5); // money,fruitStock이 변경됨
		coupang.sell(7); // money,fruitStock이 변경됨
		coupang.sell(20); // money,fruitStock이 변경됨
		coupang.sell(1); // money,fruitStock이 변경됨
		coupang.sell(30); // money,fruitStock이 변경됨
		
		System.out.println("----------판매 후----------");
		System.out.println("판매자 소지금: " + coupang.getMoney());
		System.out.println("과일 재고: " + coupang.getFruitStock());
	}

}
