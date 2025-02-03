package assignment.q30;

public class Seller {
	private int itemQuantity;
	private int safe;
	private int unitPrice;
	
	public Seller(int itemQuantity, int safe, int unitPrice) {
		this.itemQuantity = itemQuantity;
		this.safe = safe;
		this.unitPrice = unitPrice;
	}
	
	public int predicateQuantity(int sellCount) {
		if (this.itemQuantity >= sellCount) {
			return sellCount;
		}
		
		return this.itemQuantity;
	}
	
	public int predicatePrice(int sellCount) {
		if (this.itemQuantity >= sellCount) {
			return sellCount * this.unitPrice;
		}		
		return this.itemQuantity * this.unitPrice;
	}

	public int sell(int sellCount) {
		if (this.itemQuantity >= sellCount) {
			this.itemQuantity -= sellCount;
			this.safe += this.unitPrice * sellCount;
			return this.unitPrice * sellCount;
		}
		
		int tempQuantity = this.itemQuantity;
		this.itemQuantity = 0;
		this.safe += tempQuantity * this.unitPrice;
		return tempQuantity * this.unitPrice;
		}
	
	public void printState() {
		System.out.println("판매자의 상품 재고: " + this.itemQuantity + "개");
		System.out.println("상품 가격: " + this.unitPrice + "원");
		System.out.println("판매자의 금고 현황: " + this.safe + "원");
	}
}
