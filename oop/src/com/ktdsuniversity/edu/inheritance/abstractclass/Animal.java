package com.ktdsuniversity.edu.inheritance.abstractclass;

/**
 * 추상 클래스의 제약사항
 * - 어떻게 행동해야 할지 모르는 것을 표현하는 '추상 메소드'가 존재하는 '추상 클래스'는 인스턴스로 만들 수 없음
 * -> 추상 클래스를 상속받아서 모든 추상 메소드가 구현되어 있는 클래스만 인스턴스로 만들 수 있음
 * - 인스턴스로 만들 수 있는 것은 모든 것이 구현되어 있는 클래스 밖에 없음
 */

// 추상 클래스
public abstract class Animal {
	
	protected boolean isLive;
	protected String place;
	protected boolean haveEgo;
	protected double temperature;
	protected double hungry;
	
	public Animal(String place, double temperature) {
		this.isLive = true;
		this.place = place;
		this.haveEgo = true;
		this.temperature = temperature;
		this.hungry = (int)(Math.random() * 100);
		System.out.println(this.hungry);
	}
	
	// 추상 메소드
//	public abstract void living();
	
	public abstract void movement();
	
	public abstract void breath();
	
	public abstract void eat();

}
