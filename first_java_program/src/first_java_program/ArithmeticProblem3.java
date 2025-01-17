package first_java_program;

public class ArithmeticProblem3 {

	public static void main(String[] args) {
		int celsius = 30;
		int fahrenheit = (celsius * 9 / 5 ) + 32;
		
		System.out.println(fahrenheit);
		
		int celsius2 = 30;
		int fahrenheit2 = (celsius2 * 9 / 5 ) + 32;
		System.out.println("섭씨 " + celsius2 + "도는 화씨 " + fahrenheit2 + "도입니다.");
		
		double celsius3 = 36.5;
		double fahrenheit3 = (celsius3 * 9 / 5 ) + 32;
		System.out.println("섭씨 " + celsius3 + "도는 화씨 " + fahrenheit3 + "도입니다.");
	}
}
