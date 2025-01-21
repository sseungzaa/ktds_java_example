package first_java_program;

public class Method {
	
	/*public static int getTestNumber1() { // 에러가 나는 이유 고민
		int number1 = (int) (Math.random() * 100);
		if (number1>90) {
			return 100;
		}
		else if (number1>50) {
			return 30;
		}
	}*/
	
	public static int getTestNumber2() { // 에러가 안 나는 이유 고민
		int number1 = (int) (Math.random() * 100);
		if (number1>90) {
			return 100;
		}
		else if (number1>50) {
			return 30;
		}
		else {
			return -1; // 위에 에러가 나는 건 해소되지 않은 경우의 수를 처리하지 않아서
		} // 반환타입과 반환되는 값(return뒤의 값)은 일치해야 함
	}
	
	/**
	 * 파라미터는 없음
	 * 임의의 숫자 두 개를 만들어서 값을 할당하고, 두 숫자의 합을 반환
	*/
	
	public static int getAdditionResult() {
		
		/*int number11 = (int) (Math.random() * 100);
		int number22 = (int) (Math.random() * 100);*/
		int number11 = 1;
		int number22 = 2;
		
		return number11+number22;
	} // return - 1.값을 반환한다 2.실행을 즉시 종료시킨다
	
	/** 두 수를 랜덤하게 생성하고 두 수를 더한 결과를 반환시키는데,
	 * 두 수 중 하나라도 5보다 작은 수가 있다면 -1을 반환
	 */
	
	public static int getConditionalAdditionResult() {
		int number11 = (int) (Math.random() * 10);
		int number22 = (int) (Math.random() * 10);
		
		if (number11<5) {
			return -1;
		}
		
		if (number22<5) {
			return -1;
		}
		
		return number11+number22;
	}
	
	/**
	 * 1과 10 사이 홀수만 출력
	 */
	
	public static void printNumbers() {
		for (int i=1; i<11; i++) {
			if (i%2==1) {
				System.out.println(i);
				
				return;
				// 반환타입이 void인 메소드에서 return은 printNumbers 메소드를 즉시 종료시킨다
			}
		}
	}
	/**
	 * 정수 파라미터 두 개를 받아서, 첫 번째 파라미터 정수에
	 * 두 번째 파라미터 정수만큼 곱해서 문자열 파라미터와 함께 출력
	 * @param num - 정수
	 * @param time - 제곱할 횟수
	 * @param message - 결과와 함께 출력해주고 싶은 문자열
	 */
	
	public static void printPowerNumWithMessage(int num,int time,String message) {
		
 		long result=1;
		
          		for (int i=0; i<time; i++) {
   			result*=num;
		}
		System.out.println(message+result);
	}
	
	// int num:파라미터, argument, 인자 -> 통칭 임시변수(괄호 안은 전부)
	public static void printPowerNum( int num ) {
		// result:지역변수
		int result = (int) Math.pow(num, 2);
		System.out.println(num + "의 제곱수는 " + result + "입니다.");
	}
		
	/**
	 * 정해진 숫자 두 개를 더해 출력하는 메소드
	 * 숫자를 더하는 방법과 출력하는 방법이 기술
	 */
	
	public static void add() {
		int number1 = 1;
		int number2 = 3;
		
		int addResult = number1 + number2;
		
		System.out.println(number1 + " + " + number2 + " = " + addResult);
	}
	
	/**
	 * 숫자(정수)를 담는 변수 두 개에 임의의 값을 할당하고
	 * 두 숫자 중에서 더 큰 숫자만 출력
	 */
	
	public static void moreBig() {
		int number3 = (int) (Math.random() * 100);
		int number4 = (int) (Math.random() * 100);
		
		if (number3>number4) {
			System.out.println("더 큰 수는 " + number3 + "입니다.");
		}	
		else if (number3<number4) {
			System.out.println("더 큰 수는 " + number4 + "입니다.");
		}
		else {
			System.out.println("두 수가 같습니다.");
		}
	}
	/**
	 * 숫자(정수)를 담는 변수 두 개에 임의의 값을 할당하고
	 * 두 숫자를 뺐을 때 음수가 나오는 경우만 출력
	 */
	
	public static void mmm() {
		int number5 = (int) (Math.random() * 100);
		int number6 = (int) (Math.random() * 100);
		
		if (number5>number6) {
			System.out.println(number6-number5);
		}
		else if (number5<number6) {
			System.out.println(number5-number6);
		}
	}
		
	// 1부터 1000까지의 숫자 중 소수(자신과 1로만 나눠지는 수)를 찾아 출력
	
	public static void printPrimeNum() {
		
		for (int i=1; i<1001; i++) {
			
			boolean isPrimeNum = true; // @@@ false
			
			for (int j=1; j<=i; j++) {
				// 1과 자신의 수로는 나누지 않음
				if (j!=1 && j!=i) {
					if(i%j==0) {
						isPrimeNum = false; // @@@ true
						break; // 소수 아님!
					}
					// j for가 끝까지 반복을 했을 때, 0으로 나누어진 수가 존재했는가?
				}
			}
			
			// if (isPrimeNum==true) { // true==true라서 불필요함
			if (isPrimeNum) { // @@@ !isPrimeNum
				              // isPrimeNum==false <- 이것도 X
				System.out.println(i);
			}
		}
	}
	
	
	/**
	 * Method 클래스를 실행시키기 위한 특별한 메소드
	 * 이 메소드는 JVM이 실행
	 * @param args - main 메소드를 실행할 떄 필요한 인자(파라미터)
	 * */
	
	public static void main(String[] args) {
		
  		System.out.println("메소드를 호출하는 코드입니다.");
		add();
		add();
		moreBig();
		mmm();
		printPrimeNum();
		printPowerNum(10);
		printPowerNum(30);
		printPowerNum(55);
		
		// (int num,int time,String message)
		printPowerNumWithMessage(10,10,"1.결과는 ");
		printPowerNumWithMessage(30,20,"2.결과는 ");
		printPowerNumWithMessage(55,100,"3.결과는 ");
		
		int addResult = getAdditionResult();
		System.out.println(addResult);
		
		int number = getConditionalAdditionResult();
		System.out.println(number);
		
	}

}
