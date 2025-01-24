package vendingmachine;

/** 자판기를 생성하고 판매와 운영을 수행
 */
public class Mart {

	public static void main(String[] args) {
		
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 인스턴스들을 생성
		Item item1 = new Item("콜라",900,15);
		Item item2 = new Item("사이다",1500,20);
		Item item3 = new Item("환타",1300,10);
		Item item4 = new Item("밀키스",1400,5);
		
		// 자판기 인스턴스를 생성
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 상품 인스턴스도 함께 전달
		VendingMachine lotte = new VendingMachine(item1, item2, item3, item4);
		
		// 자판기에서 상품 버튼을 눌러 구매
		// 반환된 정보는 구매자가 구매한 상품 정보가 됨
		Item orderedItem = lotte.pressItemButton("콜라",10);
		// orderedItem("콜라",900,10): Item 타입
		System.out.println(orderedItem.name + "을(를) " 
						 + orderedItem.stock + "개 구입했습니다.");
		
		orderedItem = lotte.pressItemButton("사이다",5);
		// orderedItem("사이다",1300,5): Item 타입
		System.out.println(orderedItem.name + "을(를) " 
						 + orderedItem.stock + "개 구입했습니다.");
		
		orderedItem = lotte.pressItemButton("콜라",30);
		// orderedItem("콜라",900,30): null
		// Error! => NullPointerException
		if (orderedItem != null) {
			System.out.println(orderedItem.name + "을(를) " + orderedItem.stock + "개 구입했습니다.");
		}
		
		orderedItem = lotte.pressItemButton("환타",50);
		// Error! => NullPointerException
		if (orderedItem != null) {
			System.out.println(orderedItem.name + "을(를) " + orderedItem.stock + "개 구입했습니다.");
		}
		
		lotte.printItems();
		
		lotte.addItem("콜라",100);
		lotte.addItem("사이다",100);
		lotte.addItem("환타",100);
		lotte.addItem("밀키스",100);
		lotte.printItems();
	}

}
