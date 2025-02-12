package com.ktdsuniversity.edu.anonymousclass;

public class Ahri implements Unit {
	
	private String characterName;
	private String playerName;
	private int level;
	private int health;
	private int mana;
	private int money;
	private int damage;
	private int defense;
//	private float attackSpeed;
	
	public Ahri (String playerName) {
		this.characterName = "아리(B)";
		this.playerName = playerName;
		this.level = 1;
		this.health = 100;
		this.mana = 100;
	//	this.money = 0;
		this.damage = 20;
		this.defense = 10;
	//	this.attackSpeed = 1.5f;
	}
	
	@Override
	public int getHealth() {
		return this.health;
	}
	
	@Override
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public int getDefense() {
		return this.defense;
	}
	
	@Override
	public void move() {
		System.out.println(this.playerName + "(" + this.characterName + ") 가 이동 중임");
	}

	@Override
	public void basicAttack(Unit otherCharacter) {
		int otherCharacterHealth = otherCharacter.getHealth();
		
		// 상대 챔피언에게 가할 공격 포인트
		int damage = this.damage - otherCharacter.getDefense();
		if (damage < 0) {
			damage = 0;
		}
		otherCharacterHealth -= damage;
		otherCharacter.setHealth(otherCharacterHealth);
	}

	@Override
	public void skillAttack(Unit otherCharacter) {
		if (this.mana < 10) {
			return;
		}
		
		this.mana -= 10;
		int otherCharacterHealth = otherCharacter.getHealth();
		
		// 상대 챔피언에게 가할 공격 포인트
		int damage = (this.damage + this.level) - otherCharacter.getDefense();
		if (damage < 0) {
			damage = 0;
		}
		otherCharacterHealth -= damage;
		otherCharacter.setHealth(otherCharacterHealth);
		
	}

	@Override
	public void recall() {
		System.out.println(this.playerName + "(" + this.characterName + ")가 귀환 중임");
	}

	@Override
	public void buyItem() {
		this.money -= 100;
		System.out.println(this.money);
	}

	@Override
	public void sellItem() {
		this.money += 80;
		System.out.println(this.money);
	}

	@Override
	public void speak() {
		String[] script = new String[] {
				"Teleport!", "Flash!", "Attack!"
			//	    0      ,    1    ,    2       인덱스
		};
		
		int scriptIndex = (int)(Math.random() * script.length); // 0 ~ 2
		System.out.println(script[scriptIndex]);
	}

	@Override
	public void emotion() {
		String[] script = new String[] {
				"기쁨", "슬픔"
			//	  0  ,  1    인덱스
		};
		
		int scriptIndex = (int)(Math.random() * script.length); // 0 ~ 1
		System.out.println(script[scriptIndex]);
		}

	@Override
	public void die() {
		System.out.println(this.playerName + "(" + this.characterName + ")가 처치당함");
	}

	@Override
	public void takeMinions() {
		this.money += 5;
		System.out.println(this.money);
	}
}
