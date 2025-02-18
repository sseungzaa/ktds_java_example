package dataclass;

public class CoffeeShop {
	
	Coffee iceAmericano;
	Coffee hotAmericano;
	
	// 파라미터로 전달된 값들은 멤버변수에게 할당되어야 함
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano; // 멤버변수에 초기 값 할당
		this.hotAmericano = hotAmericano; // 멤버변수에 초기 값 할당
	}
	
	// orderCoffee라는 기능(메소드)
	// 파라미터 값엔 menu(아_아를 주문할 건지, 뜨_아를 주문할 건지), quantity(몇 개를 주문할 건지)
	public int orderCoffee(int menu, int quantity) {
		// 아_아를 주문할 거라면 아_아를 출력,
		// 반환시킬 값은 아_아의 금액(price) 곱하기 개수(quantity)
		if (menu == 1) {
			System.out.println(this.iceAmericano.name + "를 주문할 거야.");
			return this.iceAmericano.price * quantity;
		}
		// else if (menu == 2) {
		
		// 아_아를 주문할 게 아니라면 뜨_아를 출력
		// 반환시킬 값은 뜨_아의 금액(price) 곱하기 개수(quantity)
		else {
		System.out.println(this.hotAmericano.name + "를 주문할 거야.");
		return this.hotAmericano.price * quantity;
		}
	}
}
