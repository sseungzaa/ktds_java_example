package first_java_program;

public class UpDownGame {
	
			double randomNumber = Math.random(); 
			int quiz = (int) (randomNumber * 100); 
			// int myAnswer = 60;
			
			// Ctrl + Shift + 0
			// Command + Shift + 0
			
			System.out.println("숫자를 입력하세요 ");
			int myAnswer = new Scanner(System.in).nextInt();
			
			if (quiz == myAnswer) {
			System.out.println("정답입니다");
			}
			else if (quiz > myAnswer) {
			System.out.println("UP!");
			}
			else if (quiz < myAnswer) {
			System.out.println("DOWN!");
			}
			System.out.println("정답은 " + quiz + "입니다");

}
