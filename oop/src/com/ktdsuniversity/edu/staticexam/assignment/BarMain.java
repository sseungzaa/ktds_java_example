package com.ktdsuniversity.edu.staticexam.assignment;

public class BarMain {
	public static void main(String[] args) {
		
		Bar bar = new Bar();
		Guest adult1 = new Guest(35, 20000);
		Guest adult2 = new Guest(19, 10000);
		Guest child = new Guest(13, 10000);
		
		bar.sellLiquor(adult1);
		bar.sellLiquor(adult1);
		bar.sellDrink(adult2);
		bar.sellDrink(child);
		bar.sellLiquor(child);
		bar.sellLiquor(adult2);
		bar.sellLiquor(adult1);
		bar.sellLiquor(adult2);
		
		// 손님이 마실 것을 구매하면 그 금액만큼 손님의 소지금에서 줄어야 하는데 그걸 구현하는 걸 빼먹음
		// get, set 부분 this 다 붙이자
		// if 밑에 else if로 무조건 가는 건 아니란 걸 알아두자
	}
}
