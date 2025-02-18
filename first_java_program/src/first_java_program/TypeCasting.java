package first_java_program;

/**
 * 묵시적 형변환 실습
 */

public class TypeCasting {

	public static void main(String[] args) {
		
		
		// 1. int (4byte) 타입의 변수 정의 및 값 할당
		int intNumber = Integer.MAX_VALUE;
		
		// 2. long (8byte) 타입의 변수 정의 및 값 할당 (int 타입의 값을 할당)
		long longNumber = intNumber; //아무런 문제 없이 할당. --> 묵시적 형변환
		
		//3. 각 변수들의 값을 출력
		System.out.println(intNumber); // 2147483647
		System.out.println(longNumber); // 2147483647
		
		// 반대 케이스 실습
		
		// 1. long (8byte) 타입의 변수 정의 및 값 할당 (30억 이상의 값으로 할당)
		long longNumber2 = 3000000000L;
		
		// 2. int (4byte) 타입의 변수 정의 및 값 할당 (int 타입의 값을 할당)
		//int intNumber2 = longNumber2; ← 잘못됨 (int의 바이트가 부족해서 생기는 문제)
		// 묵시적 형변환이 불가능하므로 개발자가 직접 형변환을 해줘야 한다.
		// --> long 타입의 값을 int 타입으로 명시해서 변환이 필요 --> 명시적 형변환
		int intNumber2 = (int) longNumber2;
		
		// 3. 각 변수들의 값을 출력
		System.out.println(longNumber2);
		System.out.println(intNumber2);
		
		
		//------------------여기서부터 실습------------------
		
		
		// 정수 -> 부동소수점
			int num1 = 10;
			float fnum1 = num1;
			double dnum1 = num1;
			System.out.println(num1); // 10
			System.out.println(fnum1); // 10.0
			System.out.println(dnum1); // 10.0
		
		
		// 부동소수점 -> 정수
			float fnum2 = 10.9f;
			int num2 = (int) fnum2;
			System.out.println(fnum2) ; // 10.5
			System.out.println(num2); // 10
			
			double dnum2 = 11.15;
			num2 = (int) dnum2;
			System.out.println(dnum2); // 11.15
			System.out.println(num2); // 11
		
		
		// 부동소수점 소수점 처리
		double dnum3 = 10.1;
		// 소수점 올림
		dnum3 = Math.ceil(dnum3);
		System.out.println(dnum3); // 11.0
		
		// 소수점 버림
		dnum3 = 10.9;
		dnum3 = Math.floor(dnum3);
		System.out.println(dnum3); // 10.0
		
		// 소수점 반올림
		dnum3 = 15.18;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3); // 15.0
		dnum3 = 10.56;
		dnum3 = Math.round(dnum3);
		System.out.println(dnum3); // 11.0
		
		
		// 부동소수점 소수점 이동시키기
		// 29.37을 29.4로 올림 처리하기
		double dnum4 = 29.37;
		double dnum5 = dnum4 * 10;
		System.out.println(dnum5); // 293.7
		
		dnum5 = Math.round(dnum5);
		System.out.println(dnum5); // 294.0
		
		double dnum6 = dnum5 / 10;
		System.out.println(dnum6); // 29.4
		
		
		// 문자열 -> 정수 변환
		String numberString = "10";
		byte byteNumber3 = Byte.parseByte(numberString);
		System.out.println(byteNumber3);
		
		numberString = "10000";
		short shortNumber3 = Short.parseShort(numberString);
		System.out.println(shortNumber3);
		
		numberString = "1000000"; // int만 Integer
		int intNumber3 = Integer.parseInt(numberString);
		System.out.println(intNumber3);
		
		numberString = "1000000000";
		long longNumber3 = Long.parseLong(numberString);
		System.out.println(longNumber3);
		
		
		// 문자열 -> 부동소수점 변환
		String numberString4 = "10.5";
		float floatNumber = Float.parseFloat(numberString4);
		System.out.println(floatNumber);
		
		numberString4 = "11.12345678901234567890"; // 소수점 이하 15~16자리까지 지원(버전에 따라 다른 듯)
		double doubleNumber1 = Double.parseDouble(numberString4);
		System.out.println(doubleNumber1);
		
		numberString4 = "12";
		double doubleNumber2 = Double.parseDouble(numberString4);
		System.out.println(doubleNumber2);
		
		
		// 문자열 -> 불린 전환
		String str1 = "true";
		boolean bool1 = Boolean.parseBoolean(str1);
		System.out.println(bool1); // true
		
		str1 = "TRUE";
		bool1 = Boolean.parseBoolean(str1);
		System.out.println(bool1); // true
		
		str1= " true";
		bool1 = Boolean.parseBoolean(str1);
		System.out.println(bool1); // false
		
		str1= "tRue";
		bool1 = Boolean.parseBoolean(str1);
		System.out.println(bool1); // true
		
		str1= "tr ue";
		bool1 = Boolean.parseBoolean(str1);
		System.out.println(bool1); // false
		
		
		String str2 = "false"; // true가 아니면 무조건 false
		boolean bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2); // false
		
		str2 = "";
		bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2); // false
		
		str2 = "anystring";
		bool2 = Boolean.parseBoolean(str2);
		System.out.println(bool2); // false
		
		/*
		// 정수형이 아닌 문자열 -> 정수 오류 실습
		String numberString2 = "A";
		byte byteNumber4 = Byte.parseByte(numberString2);
		System.out.println(byteNumber4);
				
				
		// 부동소수점 -> 정수 오류 실습
		String numberString3 = "10.5";
		byte byteNumber5 = Byte.parseByte(numberString3);
		System.out.println(byteNumber5);
		*/
		
		// 숫자를 문자로 변경하기
		// 첫 번째 방법
		int age = 30;
		String ageString = String.valueOf(age);
		
		System.out.println(age + 1); // 31
		System.out.println(ageString + 1); // 301
		
		// 두 번째 방법 (강사님 왈 더 편한 방법)
		int count = 16;
		String countString = count + "";
		System.out.println(count + 1); // 17
		System.out.println(countString + 1); // 161
	}
}
