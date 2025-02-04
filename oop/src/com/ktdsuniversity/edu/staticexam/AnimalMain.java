package com.ktdsuniversity.edu.staticexam;

public class AnimalMain {
	
	/*
	static int num1 = 10;
	static int num2 = 20;
	
	public static void calculator() {
		System.out.println("계산기");
		System.out.println(num1 + num2);
	}
	*/
	
	int num1 = 10;
	int num2 = 20;
	
	public static void calculator() {
		
		AnimalMain am = new AnimalMain();
		System.out.println("계산기");
		System.out.println(am.num1 + am.num2);
	}
	
	public static void main(String[] args) {
		
		calculator();
		
		int num = NumberUtils.convertToInt("3987123");
		System.out.println(num);
		
		boolean isDecimal = NumberUtils.isDecimalFormat("1238921");
		System.out.println(isDecimal);
		
		isDecimal = NumberUtils.isDecimalFormat("12a8921");
		System.out.println(isDecimal);
		
		Animal cat1 = new Animal("춘봉", "2015-01-01", 10);
		cat1.printMyInformation(); // 인스턴스 메소드 호출
		
		Animal cat2 = Animal.createNewAnimal("첨지", "2016-01-01", 9); // 클래스 메소드 호출
		cat2.printMyInformation(); // 인스턴스 메소드 호출
	}

}
