package cafe;

/**
	아.아와 뜨.아만 판매하는 커피숍
	
	-클래스를 작성하는 순서
	멤버변수, 생성자, 메소드 _> 어떤 순서로 작성되어야 하는가?
	
	1. 상수
	2. 멤버변수
	3. 생성자
	4. 메소드
	
*/

public class CoffeeShop {
	
	int iceAmericano;
	int hotAmericano;

	// 생성자 == 메소드
	// 생성자 메소드는 반환타입이 없음
	// 생성자 메소드의 이름은 클래스의 이름과 완전히 동일해야 함
	
	public CoffeeShop(int iceAmericano,int hotAmericano) {
		System.out.println("커피숍 인스턴스를 만들었습니다.");
		System.out.println("커피숍 인스턴스: " + this);
		
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}
	
	/*
	public CoffeeShop() {
		System.out.println("커피숍 인스턴스를 만들었습니다.");
		System.out.println("커피숍 인스턴스: " + this);
		
		iceAmericano = 2500;
		hotAmericano = 2000;
	}
	*/	
	
	/**
	 * 커피숍에서 커피를 주문
	 * @param menu 1번: 아.아, 2번: 뜨.아
	 * @param quantity 커피 주문 수량 (한 번에 하나의 커피 종류만 주문할 수 있음)
	 * @return 결제해야 하는 금액
	 */
	
	public int orderCoffee(int menu, int quantity) {
		
		if (menu==1) {
			return this.iceAmericano * quantity;
		}
		else if (menu==2) {
			return this.hotAmericano * quantity;
		}
		
		// 판매하지 않는 커피를 주문하면, 결제할 금액은 0원
		return 0;
	}
}
