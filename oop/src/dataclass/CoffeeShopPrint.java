package dataclass;

public class CoffeeShopPrint {
	public static void main(String[] args) {
	// 생성자 호출(파라미터 추가)
		
			// Coffee라는 클래스를 인스턴스로 만들어줌(생성자)
			// new라는 키워드로 호출
			// 연두색의 Coffee라는 인스턴스를 만들어서 Coffee ice/hot에 할당
			// Coffee라는 클래스에서 ice는 2500의 price를 가진 이름이 "아.아"인 변수(인스턴스)
			// Coffee라는 클래스에서 hot은 2000의 price를 가진 이름이 "뜨.아"인 변수(인스턴스)
			Coffee ice = new Coffee("아.아", 2500);
			Coffee hot = new Coffee("뜨.아", 2000);
			
			// 연두색의 CoffeeShop이라는 인스턴스를 만들어서 CoffeeShop cs에 할당
			CoffeeShop cs = new CoffeeShop(ice,hot);
			// 아.아 5잔 주문
			// 아래의 cs = this, 그리고 여기서의 this는 
			int price = cs.orderCoffee(1, 5);
			System.out.println(price);
		}
}
