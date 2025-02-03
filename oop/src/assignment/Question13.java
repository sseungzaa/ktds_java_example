package assignment;

/*
실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
두 값 중 큰 수만 출력한다.
*/

public class Question13 {
	public static void main(String[] args) {
		double num1 = 10.1;
		double num2 = 20.2;
		
		if (num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
		
		double max = Math.max(num1, num2);
		
		System.out.println(max);
	}

}
