package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {
	
	private final int FRUIT_PRICE = 500;
	private int money;
	private int fruitstock;
	
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
	
}
