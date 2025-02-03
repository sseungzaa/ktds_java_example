package assignment;

/*
실수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
다섯 값의 평균보다 큰 수들을 출력한다.
*/

public class Question15 {
	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 15.6;
		double num3 = 18.7;
		double num4 = 26.8;
		double num5 = 30.9;
		
		double average = (num1 + num2 + num3 + num4 + num5) / 5;
		
		if (num1 > average) {
			System.out.println(num1 + "은(는) " + average + "보다 큼");
		}
		
		if (num2 > average) {
			System.out.println(num2 + "은(는) " + average + "보다 큼");
		}
		
		if (num3 > average) {
			System.out.println(num3 + "은(는) " + average + "보다 큼");
		}
		
		if (num4 > average) {
			System.out.println(num4 + "은(는) " + average + "보다 큼");
		}
		
		if (num5 > average) {
			System.out.println(num5 + "은(는) " + average + "보다 큼");
		}
	}
}
