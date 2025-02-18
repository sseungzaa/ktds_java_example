package assignment;

public class Buyer {
	
	// 지갑
	private int wallet;
	
	// 장바구니
	private int cart;
	
	public Buyer(int wallet, int cart) {
		this.wallet = wallet;
		this.cart = cart;
	}
	
	/**
	 * 판매자에게 상품을 구매
	 * @param buyCount - 구매 개수
	 * @param seller - 판매자
	 */
	public void buy(int buyCount, Seller seller) {
		int buyable = seller.predicateQuantity(buyCount); // 구매 예정 금액
		if (buyable <= this.wallet) {
			int boughtCount = seller.predicateQuantity(buyCount);
			int amount = seller.sell(buyCount);
			this.wallet -= amount;
			this.cart += boughtCount;
		}
	}
	
	// 구매자의 현재 상태 출력
	public void printState() {
		System.out.println("구매자의 구매 상품 수: " + this.cart + "개");
		System.out.println("구매자의 지갑 현황: " + this.wallet + "원");
	}

}
