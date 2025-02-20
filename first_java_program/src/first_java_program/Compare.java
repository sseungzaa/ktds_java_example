package first_java_program;

public class Compare {

	public static void main(String[] args) {
		
		int a = 10;
		
		// a가 10보다 큰 수인가?
		boolean isGreatThan10 = a > 10;
		System.out.println( a + "은 10보다 큰가요? " + isGreatThan10);
		
		// a가 20보다 작은 수인가?
		boolean isLessThan20 = a < 20;
		System.out.println( a + "은 20보다 작은가요? " + isLessThan20);
		
		// a가 10보다 크고 20보다 작은 수인가?
		boolean isBetweenNumber = a > 10 && a < 20;
		System.out.println( a + "은 10보다 크고 20보다 작은 수인가요? " + isBetweenNumber);
		
		// System.out.println((int) (Math.random() * 10));
		
		int b = (int) (Math.random() * 10);
		
		// b의 값이 짝수인가?
		boolean isEven1 = b % 2 == 0;
		System.out.println(b + "은(는) 짝수인가요? " + isEven1);
		
		// c는 0보다 큰 짝수인가?
		int c = (int) (Math.random() * 6); // -> 0 ~ 5
		// boolean isEven2 = c > 0 && c % 2 == 0; <- 비효율
		boolean isEven2 = c % 2 == 0 && c > 0; // <- 효율
		System.out.println(c + "은(는) 0보다 큰 짝수인가요? " + isEven2);
		
		// d는 2 또는 5의 배수인가?
		int d = (int) (Math.random() * 100); // -> 0 ~ 5
//		boolean isMultiple2Or5 = d % 5 == 0 || d % 2 == 0; <- 비효율
		boolean isMultiple2Or5 = d % 2 == 0 || d % 5 == 0; // <- 효율 (2의 배수가 더 많기 때문에 앞에)
		System.out.println(isMultiple2Or5);
		
		// son은 parent와 함께 12세 이상 관람가의 영화를 볼 수 있나?
		int son = 7;
		int parent = 40;
		// boolean isAvailable = son >= 12 || parent >=12; <- 비효율
		boolean isAvailable = parent >=12 || son >= 12; // <- 효율 (부모의 나이가 12세 이상일 확률이 높기 때문에 앞에)
		System.out.println(isAvailable);
		
		// e는 2 또는 3의 배수이면서 50보다 큰가?
		int e = (int) (Math.random() * 100);
		boolean isMultiple2Or3AndIsGreatThan50 = e > 50 && (e % 2 == 0 || e % 3 == 0); // <- 효율
		// boolean isMultiple2Or3AndIsGreatThan50 = e > 50 && (e % 2 == 0 || e % 3 == 0); // <- 비효율
		// boolean isMultiple2Or3AndIsGreatThan50 = !(e > 50) && !(e % 2 == 0 || e % 3 == 0); // <- 어렵다..
		// System.out.println(isMultiple2Or3AndIsGreatThan50);
		System.out.println(e + "는 2 또는 3의 배수이면서 50보다 큰가? " + isMultiple2Or3AndIsGreatThan50);
		
		int f = (int) (Math.random() * 100);
		
		// 1. f는 3의 배수가 아닌가? (!= 사용)
		boolean isNotMultiple3 = f % 3 != 0;
		System.out.println(f + "은(는) 3의 배수가 아닌가? " + isNotMultiple3);
		
		// 2. f는 5의 배수가 아닌가? (not 사용)
		boolean isNotMultiple5 = !(f % 5 == 0);
		System.out.println(f + "은(는) 5의 배수가 아닌가? " + isNotMultiple5);
		
		// 3. f는 7의 배수 또는 9의 배수가 아닌가? (!= 사용)
		boolean isNotMultiple7Or9A = f % 7 != 0 || f % 9 != 0;
		// boolean isNotMultiple7Or9A = f % 9 != 0 || f % 7 != 0;
		System.out.println(f + "은(는) 7의 배수 또는 9의 배수가 아닌가? " + isNotMultiple7Or9A);
		
		// 4. f는 7의 배수 또는 9의 배수가 아닌가? (not 사용)
		boolean isNotMultiple7Or9B = !(f % 7 == 0 || f % 9 == 0);
		// boolean isNotMultiple7Or9B = !(f % 9 == 0 || f % 7 == 0);
		System.out.println(f + "은(는) 7의 배수 또는 9의 배수가 아닌가? " + isNotMultiple7Or9B);
		
	}
}
