package first_java_program;

public class WhileStatement {
	public static void main(String[] args) {
		
		// 1. 1부터 10까지 출력
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);	
		
		// 2. 1부터 10까지 출력 (++ 이용)
		System.out.println("++ 이용");
		int number = 0;
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		System.out.println(++number);
		
		// 3. 1부터 10까지 출력 (while 이용)
		System.out.println("while 이용");
		int counter = 0;
		while(counter < 10) {
			System.out.println(++counter);
		}
		// 4. 1부터 10까지 출력 (무한반복 이용)
		System.out.println("출력이 시작됩니다.");
		
		int numbers = 0;
		while(true) {
			System.out.println(++numbers);
			// 종료 조건 반드시 명시
			if (numbers >= 10) {
				break;
				
			}
			
		}
		
		System.out.println("출력이 끝났습니다.");
		
	}

}
