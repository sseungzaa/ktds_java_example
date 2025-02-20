package first_java_program;

public class Variables {
	public static void main(String[] args) {
		
		System.out.println( Byte.MAX_VALUE );
		System.out.println( Byte.MAX_VALUE + 1 );
		
		byte byteNumberVariable = Byte.MAX_VALUE;
		byteNumberVariable = (byte) (byteNumberVariable + 1);
		System.out.println(byteNumberVariable);
		
		int intNumberVariable;
		intNumberVariable = 50;
		System.out.println(intNumberVariable);

		double doubleNumberVariable = 3.14;
		System.out.println(doubleNumberVariable);
		
		float floatNumberVariable = 3.14F;
		System.out.println(floatNumberVariable);
		
		int firstNumber = 100;
		int secondNumber = 110;
		int thirdNumber = (int) (firstNumber + secondNumber);
		System.out.println(thirdNumber);
		
		boolean yesOrNo = true;
		boolean noOrYes = false;
		System.out.println(noOrYes);
		System.out.println(yesOrNo);
		
		boolean isGreatThan = 3 < 1;
		System.out.println(isGreatThan); // false
		
		char letter = 'B';
		System.out.println(letter-1); // 65
		System.out.println( (char) (letter-1) ); // A
		
		int hugeNum = 1_000_000_000;
		long hugeNumber = 3_000_000_000L;
		System.out.println(hugeNum);
		System.out.println(hugeNumber);
		
	}
}
