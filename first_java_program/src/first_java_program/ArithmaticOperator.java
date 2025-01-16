package first_java_program;

/**
 * 연산자
 */

public class ArithmaticOperator {
	public static void main(String[] args) {
		
		int number1 = 1500000000;
		int number2 = 1500000000;
		int number3 = number1 + number2;
		System.out.println(number3); // -1294967296
		
		int numberr1 = 1500000000;
		int numberr2 = 1500000000;
		long numberr3 = numberr1 + (long) numberr2;
		System.out.println(numberr3); // -1294967296
		
		int number4 = 10;
		int number5 = 3;
		int number6 = number4 / number5; // 3
		System.out.println(number6);
		
		double number7 = (double) number4 / number5;
		System.out.println(number7); // 3.3333333333333335
		
		int number8 = 9;
		int remain = number8 % 2; // % -> 나누기 나머지를 구하는 연산자
		System.out.println(remain); // 1
		
		
		// 셀프 연산 (스스로에게 연산하기)
		// count 변수의 값을 1 증가시키려면?
		
		int count = 0;
		count = count + 1; // 1
		count = count + 1; // 2
		count = count + 1; // 3
		System.out.println(count);
		
		int count2 = 0;
		count2 += 1; // 1
		count2 += 1; // 2
		count2 += 1; // 3
		System.out.println(count2);
		
		int count3 = 0;
		count3++; // 1
		count3++; // 2
		count3++; // 3
		System.out.println(count3);
		
		int count4 = 0;
		System.out.println(count4);
		count4++; // 1
		System.out.println(count4);
		count4--; // 0
		System.out.println(count4);
		--count4; // -1
		System.out.println(count4);
		++count4; // 0
		System.out.println(count4);
		
		int count5 = 0;
		System.out.println(count5++); // 0
		System.out.println(count5); // 1
		System.out.println(count5--); // 1
		System.out.println(count5); // 0
		
		System.out.println(++count5); // 1
		System.out.println(--count5); // 0
		
		/*int count5 = 0;
		Sys~ ( count5(끝)++(↓) ) // 0
		Sys~ ( count5 ) // 1
		Sys~ ( count5(끝)--(↓) ) // 1
		Sys~ ( count5 ) // 0
		
		System.out.println(++count5); // 1
		System.out.println(--count5); // 0
		*/
		
	}

}
