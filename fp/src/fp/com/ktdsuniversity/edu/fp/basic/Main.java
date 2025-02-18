package fp.com.ktdsuniversity.edu.fp.basic;

public class Main {
	
	public static void main(String[] args) {
		
		// YesOrNo 익명 클래스 만들기
		YesOrNo yn = new YesOrNo() {
			@Override
			public boolean test(int value) {
				// value가 짝수면 true, 아니면 false
				return value % 2 == 0;
			}
		};
		System.out.println("----------짝수 여부----------");
		System.out.println("9: " + yn.test(9)); // false
		System.out.println("8: " + yn.test(8)); // true
		System.out.println("1: " + yn.test(1)); // false
		System.out.println("6: " + yn.test(6)); // true
		
		YesOrNo ynFunction1 = (int value) -> {
			return value % 2 == 0;
		};
		
		// 함수의 인풋은 타입을 생략할 수 있음
		YesOrNo ynFunction2 = (value) -> {
			return value % 2 == 0;
		};
		
		// 함수의 아웃풋은 타입을 생략할 수 있음
		YesOrNo ynFunction3 = (value) -> value % 2 == 0;
		
		System.out.println("9: " + ynFunction1.test(9)); // false
		System.out.println("8: " + ynFunction1.test(8)); // true
		System.out.println("7: " + ynFunction2.test(7)); // false
		System.out.println("6: " + ynFunction2.test(6)); // true
		System.out.println("5: " + ynFunction3.test(5)); // false
		System.out.println("4: " + ynFunction3.test(4)); // true
		
		// Java Built-In Functions
		// 	1. Predicate -> input -> boolean
		// 	2. Function -> input -> Anything
		// 	3. Consumer -> input -> void
		
		
		// 함수에 익숙해지고 나서의 문제
		// -> 디버깅이 쉽지 않음 -> 의도적으로 줄을 나눔
		FunctionParameter fp = new FunctionParameter();
		boolean isEven = fp.isEven(12,
									(value) ->
										value % 2 == 0);
		System.out.println(isEven);
		
		boolean isValidAge = fp.isValidAge(300,
									(value) ->
										value >= 0 && value <= 100);
		System.out.println(isValidAge);
		
		
		YesOrNo enoughFunction = fp.enoughMoney();
		boolean enough = enoughFunction.test(10000);
		System.out.println(enough);
		
		enough = enoughFunction.test(3000);
		System.out.println(enough);
		
		// output이 void일 땐 {}(중괄호)를 넣어줌
		Calculator simpleCalc = (n1, n2) -> {
			int result = n1 + n2;
			
			// result의 값이 10000보다 큰가?를 알아보기 (함수로)
			YesOrNo calcValidator = (value) -> value > 10000;
			boolean isValid = calcValidator.test(result);
			System.out.println(isValid);
		};
		
		simpleCalc.calc(10000, 100000);
	}
}
