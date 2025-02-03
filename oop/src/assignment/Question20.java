package assignment;

import java.util.Scanner;

/*
Scanner 이용.
정수형 변수 enemyHealthPoint 를 만들고 Scanner의 nextInt() 함수를 이용해 값을 할당한다.
무한히 반복을 하면서 난수를 생성해 enemyHealthPoint의 값을 감소 시킨다.
만약 enemyHealthPoint의 값이 0이 되거나 음수가 되면 "Victory!" 를 출력하며 반복문을 종료한다.
*/

public class Question20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HP를 입력하세요.");
		int enemyHealthPoint = sc.nextInt();
		
		int attack = 0;
		while (enemyHealthPoint > 0) {
			attack = (int) (Math.random() * 100);
			enemyHealthPoint -= attack;
			System.out.println("입힌 피해량 :" + attack + ", 남은 HP :" + enemyHealthPoint);
		}
		System.out.println("Victory!");
	}

}
