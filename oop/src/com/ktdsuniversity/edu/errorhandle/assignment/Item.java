package com.ktdsuniversity.edu.errorhandle.assignment;

/* 상품 설계 (데이터 클래스)
--생성자(상품 번호, 상품 이름, 상품 가격, 상품 재고 수, 상품 소비기한까지 남은 일 수)
--멤버변수
	-상품 번호
	-상품 이름
	-상품 가격
	-상품 재고 수
	-상품 소비 기한까지 남은 일 수
--기능
	-toString()
*/

public class Item {
	
	private int number;
	private String name;
	private int price;
	private int stock;
	private int expiration;

    public Item(int number, String name, int price, int stock, int expiration) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.expiration = expiration;
    }
    
    public int getNumber() {
		return this.number;
	}
    
    public String getName() {
		return this.name;
	}
    
    public int getPrice() {
		return this.price;
	}
    
    public int getStock() {
		return this.stock;
	}
    
    public int getExpiration() {
		return this.expiration;
	}
    
    @Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("상품 번호: " + this.number);
		sb.append(", 상품 이름: " + this.name);
		sb.append(", 상품 가격: " + this.price);
		sb.append(", 남은 개수: " + this.stock);
		sb.append(", 남은 소비 기한 일 수: " + this.expiration);
		return sb.toString();
	}

}
