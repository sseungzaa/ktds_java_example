package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Snake extends Animal {

	public Snake(String place) {
		super(place, 30);
	}

	@Override
	public void movement() {
		super.temperature += 1;
		if (super.temperature >= 36) {
			super.temperature = 36;
		}
		
		super.hungry += 1;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		System.out.println("뱀이 " + super.place + "에서 스르륵 기어갑니다.");
	}

	@Override
	public void breath() {
		super.temperature += 0.1;
		if (super.temperature >= 36) {
			super.temperature = 36;
		}
		
		super.hungry += 0.3;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		System.out.println("뱀이 " + super.place + "에서 숨 쉽니다.");
	}

	@Override
	public void eat() {
		if (super.hungry == 99) {
			System.out.println("뱀이 " + super.place + "에서 먹이를 삼킵니다.");
			super.hungry = 0;
		}
		else {
			System.out.println("뱀이 먹이를 먹을 생각이 없습니다.");
		}
		
	}

}
