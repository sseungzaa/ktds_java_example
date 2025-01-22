package first_java_program;

public class MethodProblem {
	
	/* 1. 1부터 100까지의 합
		int sum1 = 0;
		for(int i=1; i<101; i++) {
		sum1+=i;
		}
		System.out.println(sum1);
	}*/
	
	public static void printProblem1() {
		int sum1 = 0;
		// int Sum1Result = sum1;
		for(int i=1; i<101; i++) {
		sum1+=i;
		}
		System.out.println("1부터 100까지의 합은 " + sum1);
	}
	
	/*2. 1부터 100 중 홀수의 합
		int sum2 = 0;
		for(int i=1; i<101; i+=2) {
		sum2+=i;
		}
		System.out.println(sum2);
	}*/
	
	public static void printProblem2() {
		int sum2 = 0;
		for(int i=1; i<101; i+=2) {
		sum2+=i;
		}
		System.out.println("1부터 100까지에서 홀수의 합은 " + sum2);
	}
	
	public static void printProblem3() {
		for(int i=1; i<101; i++) {
			if(i%3==0&&i%5==0&&i%6==0) {
				System.out.println("1부터 100까지에서 3,5,6 모두의 배수는 " + i);
			}
		}
	}
	
	public static void printProblem4() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// public static int printProblem5(int minutes,int seconds) {
		
				
				
				
	public static void main(String[] args) {
		System.out.println("메소드 호출");
		printProblem1();
		
		printProblem2();
		
		printProblem3();
		
		printProblem4();
		
		
	}
}