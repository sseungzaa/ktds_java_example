package dataclass;

public class Item {
	
	// Item 클래스에서 쓰일 멤버변수 선언
	String name;
	int price;
	int stock;
	
	
	public Item(String name,int price,int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	
}
