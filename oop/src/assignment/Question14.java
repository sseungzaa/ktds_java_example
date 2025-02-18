package assignment;

/*
실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
세 값 중 가장 작은 수만 출력한다.
*/

public class Question14 {
	public static void main(String[] args) {
		double num1 = 10.1;
		double num2 = 20.2;
		double num3 = 30.3;
		
		double min = num1;
		if ( min > num2 ) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}
		System.out.println(min);
		
		double min1 = Math.min(num1, num2);
		double min2 = Math.min(min1, num3);
		
		System.out.println(min2);
		
	}
}
