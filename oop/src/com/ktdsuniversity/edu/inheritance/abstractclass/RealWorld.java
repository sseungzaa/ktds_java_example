package com.ktdsuniversity.edu.inheritance.abstractclass;

public class RealWorld {
	
	public static void behavior(Animal animal) {
		animal.movement();
		animal.breath();
		animal.eat();
	}
	
	public static void main(String[] args) {
		
	//	Animal dog = new Animal("home");
	//	Dog dog = new Dog("Home");
		
		Animal dog = new Dog("뿌꾸", "두치 집"); // 
		behavior(dog);;
		
		Animal human = new Human("이대길", 30, "서울"); // 
		behavior(human);;
	}

}
