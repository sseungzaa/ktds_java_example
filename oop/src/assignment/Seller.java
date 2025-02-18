package assignment;

public class Seller {
	
	// 상품 개수
	private int itemQuantity;
	// 금고
	private int safe;
	// 상품 단가
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
	
	/**
	 * 판매하려는 상품의 금액을 반환
	 * @param sellCount - 판매 예정 개수
	 * @return 판매 예정 금액
	 */
	
	public int predicatePrice(int sellCount) {
		if (this.itemQuantity >= sellCount) {
			return sellCount * this.unitPrice;
		}
		
		return this.itemQuantity * this.unitPrice;
	}

	/**
	 * 상품을 판매
	 * @param sellCount - 판매 개수
	 * @return 판매 확정 금액
	 */
	
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
	
	// 판매자의 현재 상태 출력
	public void printState() {
		System.out.println("판매자의 상품 재고: " + this.itemQuantity + "개");
		System.out.println("상품 가격: " + this.unitPrice + "원");
		System.out.println("판매자의 금고 현황: " + this.safe + "원");
	}
}
