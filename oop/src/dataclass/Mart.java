package dataclass;

public class Mart {
	
	public static void main(String[] args) {
		Item item1 = new Item("박카스",900,15);
		Item item2 = new Item("몬스터",1500,20);
		Item item3 = new Item("핫식스",1300,10);
		Item item4 = new Item("밀키스",1400,5);
		
		VendingMachine lotte = new VendingMachine(item1,item2,item3,item4);
		
		/* Item orderedItem = lotte.pressItemButton("박카스", 0);
		System.out.println(orderedItem); */
	}

}
