package com.ktdsuniversity.edu.inheritance.abstractclass;

public class Human extends Animal {
	
	private String name;
	private int age;
//	private int height;
//	private int weight;
	
	public Human(String name, int age, String place) { //int height, int weight, String place) {
		super(place, 36.5);
		this.name = name;
		this.age = age;
	//	this.height = height;
	//	this.weight = weight;
	}
	
	@Override
	public void movement() {
		super.temperature += 0.1;
		if (super.temperature >= 41) {
			super.temperature = 41;
		}
		
		super.hungry += 1;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		if (super.hungry > 80) {
			System.out.printf("사람 %s (%d세) 가 움직일 기력이 없습니다.\n", this.name, this.age);
			return;
		}
		
		if (super.temperature >= 40) {
			System.out.printf("사람 %s (%d세) 가 많이 아파 빨리 병원에 가야 합니다.\n", this.name, this.age);
			return;
		}
		else if (super.temperature >= 38) {
			System.out.printf("사람 %s (%d세) 가 아파 병원에 가야 합니다.\n", this.name, this.age);
			return;
		}
		
		System.out.printf("사람 %s (%d세) 가 멀쩡히 두 발로 잘 다닙니다.\n", this.name, this.age);
	}
	
	@Override
	public void breath() {
		super.temperature -= 0.1;
		if (super.temperature >= 41) {
			super.temperature = 41;
		}
		
		super.hungry += 0.1;
		if (super.hungry >= 99) {
			super.hungry = 99;
		}
		
		System.out.printf("사람 %s (%d세) 가 %s 에서 편하게 호흡하고 있습니다.\n", this.name, this.age, super.place);
	}
	
	@Override
	public void eat() {
		super.hungry -= 2;
		if (super.hungry < 0) {
			super.hungry = 0;
		}
		
		if (super.hungry > 80) {
			System.out.printf("사람 %s (%d세)가 닥치는 대로 다 먹습니다.\n", this.name, this.age);
			return;
		}
		else if (super.hungry > 60) {
			System.out.printf("사람 %s (%d세)가 식사합니다.\n", this.name, this.age);
			return;
		}
		else if (super.hungry > 40) {
			System.out.printf("사람 %s (%d세)가 간식을 먹습니다.\n", this.name, this.age);
			return;
		}
		
		System.out.printf("사람 %s (%d세)은(는) 먹을 필요를 못느낍니다.\n", this.name, this.age);
	}
	
	/* 내가 한 부분
	@Override
	public void movement() {
		super.hungry += 5;
		
		if (super.hungry >=99) {
			super.hungry = 99;
		}
		
		super.temperature += 0.2;
		
		if (super.temperature >= 42) {
			super.temperature = 42;
		}
		
		// 사람.this.name이 super.place에 삽니다.
		System.out.println(this.age + "세의 사람 " + this.name + "은(는) " + super.place + "에 삽니다.");
		System.out.println(this.age + "세의 사람 " + this.name + "의 생존 여부: " + super.isLive);
	}
	
	@Override
	public void breath() {
		
		if (super.temperature >= 37.5) {
			System.out.println(this.age + "세의 사람 " + this.name + "은(는) 고열로 굉장히 아픕니다.");
		}
		else {
			System.out.println(this.age + "세의 사람 " + this.name + "은(는) 건강합니다.");
		}
		
		System.out.println("현재 체온은 " + super.temperature + "도입니다.");
		
		super.temperature -= 0.1;
		
		if (super.temperature < 36.5) {
			super.temperature= 36.5;
		}
	}
	
	@Override
	public void eat() {
		
		if (super.hungry > 80) {
			System.out.println(this.age + "세의 사람 " + this.name + "은(는) 배가 고픕니다. 밥을 허겁지겁 먹습니다.");
		}
		else if (super.hungry > 50) {
			System.out.println(this.age + "세의 사람 " + this.name + "은(는) 밥 때가 되어 밥을 먹습니다.");
		}
		else {
			System.out.println(this.age + "세의 사람 " + this.name + "은(는) 아직 배고픔을 느끼고 있진 않습니다.");
		}
		
		System.out.println("현재 배고픈 정도는 " + super.hungry + "입니다.");
		
		super.hungry -= 50;
		if (super.hungry < 0) {
			super.hungry = 0;
		}
	}
	*/

}
