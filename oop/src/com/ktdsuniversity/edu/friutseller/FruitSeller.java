package com.ktdsuniversity.edu.friutseller;

public class FruitSeller {
	
	private final int FRUIT_PRICE = 500;
	private int money;
	private int fruitstock;
	
	// 생성자 오버로딩 파트
	public FruitSeller() {
		this.money = 10000;
		this.fruitstock = 4;
	}
	// 생성자 오버로딩 파트
	
	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitstock = fruitStock;
	}

	public int getMoney() {
		return this.money;
	}
	public int getFruitStock() {
		return this.fruitstock;
	}
	
	/*
	 * public ComicCafeOwner(String bookName,boolean rentBook) {
	 * 	this.bookname = bookName;
	 * 	this.rentbook = rentBook;
	 * 
	 * public int getMoney() {
	 * 	return this.money;
	*/
	
	/**
	 * 과일을 판매: 
	 * 과일을 판매하면 판매 개수만큼 재고가 줄어야 하며, 판매 개수만큼 소지금이 증가해야 함
	 * @param quantity 판매 개수 
	*/
	public void sell(int quantity) {
		if (this.fruitstock >= quantity) {
			this.fruitstock -= quantity;
			this.money += quantity * FRUIT_PRICE;
		}
	}
	
	// 메소드 오버로딩 파트
	public void sell() {
		this.sell(1);
		
		/*
		if (this.fruitstock >= 1) {
			this.fruitstock -= 1;
			this.money += 1 * FRUIT_PRICE;
		}
		*/
	}
	// 메소드 오버로딩 파트
	
}
