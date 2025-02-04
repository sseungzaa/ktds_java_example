package com.ktdsuniversity.edu.staticexam;

public class Animal {
	
	// 멤버변수 = 인스턴스 변수 = 인스턴스로만 접근 가능한 변수
	private String name;
	private String birthdate;
	private int age;
	
	// 생성자 = 인스턴스 생성자 = 인스턴스를 만들어주는 메소드
	public Animal(String name, String birthdate, int age) {
		this.name = name;
		this.birthdate = birthdate;
		this.age = age;
	}
	
	// 메소드 = 인스턴스 메소드 = 인스턴스로만 호출할 수 있는 메소드
	public void printMyInformation() {
		System.out.println("이름: " + this.name);
		System.out.println("태어난 날짜: " + this.birthdate);
		System.out.println("나이: " + this.age);
	}
	
	public static Animal createNewAnimal(String name, String birthdate, int age) {
		Animal newAnimal = new Animal(name, birthdate, age);
		newAnimal.printMyInformation();
		return newAnimal;
		// static 내부에서 인스턴스를 만들면 인스턴스에 접근 가능
		// 위에 거 = 밑에 거
		// return new Animal(name,birthdate,age);
	}

}
