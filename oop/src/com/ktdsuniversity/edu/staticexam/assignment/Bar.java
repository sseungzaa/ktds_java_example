package com.ktdsuniversity.edu.staticexam.assignment;

/*
 음료와 주류를 파는 바입니다.
 음료 혹은 주류를 고객에게 팔면 바는 돈을 법니다.
 음료와 주류는 개수의 제한이 없습니다.
 음료 가격과 주류 가격은 다릅니다.
 음료 가격과 주류 가격은 절대 바뀔 수 없으며, 고객이 가격을 알고 있어야 합니다. - static 이용
 19세 미만의 고객에게는 주류는 팔 수 없습니다.
 고객이 음료 혹은 주류를 구매할 돈이 없다면 구매할 수 없습니다.
 주류를 마실 경우 취한 정도가 0.5씩 오릅니다.
 음료를 마실 경우 배부른 정도가 0.2씩 오릅니다.
 고객이 잔뜩 취했거나 배가 매우 부를 때엔 고객의 돈이 충분하더라도 더 이상 판매하지 않습니다.
 고객의 취한 정도가 10 이상이면 잔뜩 취했다라고 가정합니다. - static 메소드 이용
 고객의 배부른 정도가 20 이상이면 더 이상 먹을 수 없다라고 가정합니다. - static 메소드 이용
 */

public class Bar {
	
	// 바의 금고 멤버변수
	private int safe;
	
	// 바 생성자 (바의 금고의 처음 금액은 0으로 설정)
	public Bar() {
		this.safe = 0;
	}
	
	// 주류와 음료의 가격 final static
	public final static int LIQUOR_PRICE = 5000;
	public final static int DRINK_PRICE = 4000;
	
	// 주류를 판매하는 기능 메소드
	public void sellLiquor(Guest guest) {
		
		// 주류를 판매할 수 있는 경우
		if(canSellLiquor(guest)) {
			guest.setMoney(guest.getMoney() - LIQUOR_PRICE);
			guest.setDrunk(guest.getDrunk() + 0.5);
			this.safe += LIQUOR_PRICE;
			System.out.println("주류를 판매했습니다.");
			System.out.println("바의 금고 현황: " + this.safe);
		}
		
		// 주류를 판매할 수 없는 경우
		else {
			// 19세 미만
			if(guest.getAge() < 19) {
				System.out.println("미성년자에게는 주류를 판매할 수 없습니다.");
			}
			// 돈 부족
			if(guest.getMoney() < LIQUOR_PRICE) {
				System.out.println("돈이 부족하여 주류를 구매할 수 없습니다.");
			}
			// 만취
			if(guest.getDrunk() >= 10.0) {
				System.out.println("만취한 사람에게는 더 이상 주류를 판매할 수 없습니다.");
			}
		}
	}
	
	public void sellDrink(Guest guest) {
		// 음료를 판매할 수 있는 경우
		if(canSellDrink(guest)) {
			guest.setMoney(guest.getMoney() - DRINK_PRICE);
			guest.setFull(guest.getFull() + 0.2);
			this.safe += DRINK_PRICE;
			System.out.println("음료를 판매했습니다.");
			System.out.println("바의 금고 현황: " + this.safe);
		}
		// 음료를 판매할 수 없는 경우
		else {
			// 돈 부족
			if(guest.getMoney() < DRINK_PRICE) {
				System.out.println("돈이 부족하여 음료를 구매할 수 없습니다.");
			}
			// 배부름
			if(guest.getFull() >= 20.0) {
				System.out.println("이미 배가 완전히 부른 사람에게는 더 이상 음료를 판매할 수 없습니다.");
			}
		}
	}
	
	// static - 취한 정도 10 이상이면 만취
	public static boolean canSellLiquor(Guest guest) {
		return guest.getDrunk() < 10.0 && guest.getAge() >= 19;
	}
	
	// static - 배부른 정도 20 이상이면 완전히 배부름
	public static boolean canSellDrink(Guest guest) {
		return guest.getFull() < 20.0;
	}

}
