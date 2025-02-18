package com.ktdsuniversity.edu.staticexam;

/* 클래스 변수,상수,메소드에 간편히 접근하기 위한 static import
 * -> 안 쓰는 게 좋긴 함
 */
import static com.ktdsuniversity.edu.staticexam.Car.INSTANCE_COUNT;

public class CarMainn {
	public static void main(String[] args) {
		
		System.out.println(INSTANCE_COUNT); // CarMain이랑 비교되는 부분
		
		Car car1 = new Car("경차");
		System.out.println(Car.INSTANCE_COUNT);
		
		Car car2 = new Car("소형차");
		System.out.println(Car.INSTANCE_COUNT);
	}

}
