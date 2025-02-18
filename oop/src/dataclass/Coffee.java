package dataclass;

/**
 * 아.아=2500원, 뜨.아=2000원인 커피숍에서 아.아 5잔을 주문
 * 지불해야 할 금액은 얼마인지 출력
 */

public class Coffee {
	
	// Coffee라는 클래스에서 쓰일 멤버변수를 선언
	// String이라는 클래스, name/price라는 멤버변수
	// name은 문자기 때문에 String으로
	// price는 숫자기 때문에 int로
	String name;
	int price;
	
	// 초록색 Coffee는 메소드(기능) -> 생성자: 인스턴스를 생성하는 메소드
	// String과 int는 파라미터 타입
	// name과 price는 파라미터 명(값)
	// 생성자는 아래와 같이 public 클래스명으로 선언
	// 생성자 이름은 인스턴스로 만들려는 클래스의 이름과 동일해야 하기 때문에 똑같이 Coffee
	public Coffee(String name, int price) {
		// this: 메소드를 호출한 인스턴스
		// this ??????????????????????????
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		// 생성자 호출(파라미터 추가)
			
				// Coffee라는 클래스를 인스턴스로 만들어줌(생성자)
				// new라는 키워드로 호출
				// 연두색의 Coffee라는 인스턴스를 만들어서 Coffee ice/hot에 할당
				// Coffee라는 클래스에서 ice는 2500의 price를 가진 이름이 "아_아"인 변수(인스턴스)
				// Coffee라는 클래스에서 hot은 2000의 price를 가진 이름이 "뜨_아"인 변수(인스턴스)
				Coffee ice = new Coffee("아_아", 2500);
				Coffee hot = new Coffee("뜨_아", 2000);
				
				// 연두색의 CoffeeShop이라는 인스턴스를 만들어서 CoffeeShop coffeeshop에 할당
				CoffeeShop coffeeshop = new CoffeeShop(ice,hot);
				// 아_아 5잔 주문
				// 아래의 coffeeshop = this, 그리고 여기서의 this는 ??????????????????
				int price = coffeeshop.orderCoffee(1, 5);
				System.out.println("내야 할 금액은 " + price + "원이야.");
			}
}


/* 멤버변수
 * 생성자
 * 메소드
 * 인스턴스
 * 클래스
*/