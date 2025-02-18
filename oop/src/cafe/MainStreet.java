package cafe;

public class MainStreet {
	
	public static void main(String[] args) {
		
		CoffeeShop megaCoffee = new CoffeeShop(2500,2000);
		/* megaCoffee.iceAmericano += 500;
		megaCoffee.hotAmericano += 500; */
		System.out.println(megaCoffee);
		
		System.out.println(megaCoffee.iceAmericano);
		System.out.println(megaCoffee.hotAmericano);
		
		// megaCoffee.orderCoffee <- megacoffee-인스턴스, orderCoffee-메소드
		int megaOrderPrice = megaCoffee.orderCoffee(1,5);
		System.out.println("메가커피에서 주문한 커피의 총 주문금액은 " + megaOrderPrice + "원입니다.");
		
		CoffeeShop starbucks = new CoffeeShop(4500,4500);
		System.out.println(starbucks);
		System.out.println(starbucks.iceAmericano);
		System.out.println(starbucks.hotAmericano);
		
		int starbucksOrderPrice = starbucks.orderCoffee(2,2);
		System.out.println("스타벅스에서 주문한 커피의 총 주문금액은 " + starbucksOrderPrice + "원입니다.");
		
		starbucksOrderPrice = starbucks.orderCoffee(99,2);
		System.out.println("스타벅스에서 주문한 커피의 총 주문금액은 " + starbucksOrderPrice + "원입니다.");
	}

}
