package com.ktdsuniversity.edu.staticexam.assignment;

public class Guest {
	
	private double drunk;
	private double full;	
	private int age;
	private int money;
	
	public Guest(int age, int money) {
		this.drunk = 0.0;
		this.full = 0.0;
		this.age = age;
		this.money = money;
	}
	
	public double getDrunk() {
		return this.drunk;
	}
	
	public double getFull() {
		return this.full;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setDrunk(double drunk) {
		this.drunk = drunk;
	}
	
	public void setFull(double full) {
		this.full = full;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}

}
