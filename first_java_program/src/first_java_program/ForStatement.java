package first_java_program;

public class ForStatement {
	public static void main(String[] args) {
		
		// 1. 1부터 10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=".repeat(100));
		
		// 2. 1부터 10 사이에 있는 홀수만 출력
		for (int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("=".repeat(100));
		
		// 3. 2부터 10 사이에 있는 짝수만 출력
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("=".repeat(100));
		
		// 구구단을 출력
		for(int i=2; i<10; i++) {
			System.out.println(i + "x" + 1 + "=" + i*1);
			System.out.println(i + "x" + 2 + "=" + i*2);
			System.out.println(i + "x" + 3 + "=" + i*3);
			System.out.println(i + "x" + 4 + "=" + i*4);
			System.out.println(i + "x" + 5 + "=" + i*5);
			System.out.println(i + "x" + 6 + "=" + i*6);
			System.out.println(i + "x" + 7 + "=" + i*7);
			System.out.println(i + "x" + 8 + "=" + i*8);
			System.out.println(i + "x" + 9 + "=" + i*9);
		}
		
		System.out.println("=".repeat(100));
		
		// 이중 for 반복문으로 구구단을 출력
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
		System.out.println("=".repeat(100));
		
		// 반복문 연습문제
		// 1. 1부터 100까지의 합
		int sum1 = 0;
		for(int i = 1; i < 101; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		System.out.println("=".repeat(100));
		
		// 2. 1부터 100 중 홀수의 합
		int sum2 = 0;
		for(int i = 1; i < 101; i += 2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		System.out.println("=".repeat(100));
		
		// 3. 1부터 100 중 3,5,6 모두의 배수
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0 && i %5 == 0 && i %6 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("=".repeat(100));
		
		// 4. * 문제
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(100));
		
		// 5. 추가 문제 (7237 각 자리 수의 합)
		// 방법1. 자리수마다 더하기
		int num = 7237;
		// num이 몇 번째 자리까지 있나?->10을 몇 번 제곱해야 num이 되나?
		int length = (int) Math.log10(num) + 1;
		int sum3 = 0;
		// num의 자리수만큼 반복하며 더함
		for(int i = 0; i < length; i++) {
			int n = num%10;
			sum3 += n;
			num /= 10;
		}
		System.out.println("모든 자리를 더하면 " + sum3 + "입니다.");
		
		// 방법2. 자리수마다 더하기 (문자열로)
		num = 7237;
		// 숫자를 문자열로 바꿈
		// 문자열 한 글자 한 글자를 더하기 위해
		String numStr = num + "";
		int sum4 = 0;
		for(char n:numStr.toCharArray()) {
			sum4 += Integer.parseInt(n + "");
		}
		System.out.println("모든 자리를 더하면 " + sum4 + "입니다.");
		
		// 방법3. ai
		int number = 7237;
		int sum5 = 0;
		
		while(number > 0) {
			sum5 += number % 10;
			number /= 10;
		}
		System.out.println("모든 자리를 더하면 " + sum5 + "입니다.");
	}	
}
