package first_java_program;

public class ArithmeticPractice00 {

	public static void main(String[] args) {
		int number = 10;
		int multipledNumber = number * 3;
		System.out.println(multipledNumber);
		
		int minutes = 5;
		int seconds = 50;
		int time = minutes * 60 + seconds;
		System.out.println(time);
		
		int minutes2 = 5;
		int seconds2 = 50;
		int time2 = minutes2 * 60 + seconds2;
		System.out.println( time2 + "초는 " + minutes2 + "분" + seconds2 + "초입니다.");
	}
}
