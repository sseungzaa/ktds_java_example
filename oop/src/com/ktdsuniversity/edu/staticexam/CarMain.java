package com.ktdsuniversity.edu.staticexam;

public class CarMain {
	public static void main(String[] args) {
		
		System.out.println(Car.INSTANCE_COUNT); // CarMainn이랑 비교되는 부분
		
		Car car1 = new Car("경차");
		System.out.println(Car.INSTANCE_COUNT);
		
		Car car2 = new Car("소형차");
		System.out.println(Car.INSTANCE_COUNT);
	}

}
