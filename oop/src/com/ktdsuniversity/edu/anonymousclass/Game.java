package com.ktdsuniversity.edu.anonymousclass;

public class Game {
	
	public static void main(String[] args) {
		
		Unit ahri = new Ahri("Faker");
		
		// 클래스 구현 없이 인스턴스를 만들려면 'new 추상 클래스 or 인터페이스() {}';
		// 익명 클래스
		/* 익명 클래스의 한계점
		   클래스: 여러 개의 인터페이스를 구현할 수 있음
		   익명 클래스: 한 번에 하나의 인터페이스만 구현할 수 있음
		 */
		Unit other = new Unit() {
			
			private String characterName = "아리(R)";
			private String playerName = "Chovy";
			private int level = 1;
			private int health = 100;
			private int mana = 100;
			private int money = 100;
			private int damage = 20;
			private int defense = 10;
		//	private float attackSpeed = 1.5f;
			
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
};
		
		ahri.move();
		other.move();
		
		ahri.basicAttack(other);
		other.skillAttack(ahri);
		
		ahri.speak();
		other.speak();
	}

}
