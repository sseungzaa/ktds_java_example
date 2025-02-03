package assignment.q30;

public class Market {
	public static void main(String[] args) {
		Seller compose = new Seller(10, 5000, 4000);
		Seller starbucks = new Seller(5, 10000, 6000);
		Buyer me = new Buyer(60000, 0);
		
		me.buy(5, compose);
		me.buy(3, starbucks);
		me.buy(1, starbucks);
		me.buy(3, starbucks);
		
		compose.printState();
		starbucks.printState();
		me.printState();
	}
}
