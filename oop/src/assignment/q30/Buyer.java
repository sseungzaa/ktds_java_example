package assignment.q30;

public class Buyer {
	private int wallet;
	private int cart;
	
	public Buyer(int wallet, int cart) {
		this.wallet = wallet;
		this.cart = cart;
	}
	
	public void buy(int buyCount, Seller seller) {
		int buyable = seller.predicateQuantity(buyCount);
		if (buyable <= this.wallet) {
			int boughtCount = seller.predicateQuantity(buyCount);
			int amount = seller.sell(buyCount);
			this.wallet -= amount;
			this.cart += boughtCount;
		}
	}
	
	public void printState() {
		System.out.println("구매자의 구매 상품 수: " + this.cart + "개");
		System.out.println("구매자의 지갑 현황: " + this.wallet + "원");
	}
}
