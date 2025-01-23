package dataclass;

public class VendingMachine {
	
	Item item1;
	Item item2;
	Item item3;
	Item item4;
	
	public VendingMachine(Item item1, Item item2, Item item3, Item item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}
	
	/* public Item pressItemButton(String itemName, int orderCount) {
		if (itemName == this.item1.name) {
			if (this.item1.stock >= orderCount) {
				this.item1.stock -= orderCount;
				return new Item(this.item1.name,this.item1.price,orderCount);
			}
			else {
				
			}
		}
	} */
}
