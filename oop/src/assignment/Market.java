package assignment;

/**
 * 판매자와 구매자가 만나는 곳
 */

public class Market {
	public static void main(String[] args) {
		Seller compose = new Seller(10,5000,4000);
		Seller starbucks = new Seller(5,10000,6000);
		Buyer me = new Buyer(50000,0);
		
		me.buy(3, compose); // -12000원, 판매자 개수 10->7
		me.buy(3, starbucks); // -18000원, 판매자 개수 5->2
		me.buy(1, starbucks); // -6000원, 판매자 개수 2->1
		me.buy(3, starbucks); // -6000원, 판매자 개수 1->0
		
		compose.printState(); // 몇 개 남았을까? 27개
		starbucks.printState(); // 몇 개 남았을까? 0개
		me.printState(); // 몇 개 샀을까? 6개
	}

}
