package fp.com.ktdsuniversity.edu.fp.basic;

public class FunctionParameter {
	/**
	 * 함수를 파라미터로 전달하기
	 * @param age
	 * @param yesOrNo (value) -> lambda code;
	 * @return	
	*/
	public boolean isValidAge(int age, YesOrNo yesOrNo) {
		boolean isValidAge = yesOrNo.test(age);
		System.out.println(age + "은(는) " + (isValidAge ? "정상적인" : "잘못된") + " 나이입니다.");
		return isValidAge;
	}
	
	public boolean isEven(int number, YesOrNo yesOrNo) {
		boolean isEven = yesOrNo.test(number);
		System.out.println(number + "은(는) " + (isEven ? "짝" : "홀") + "수입니다.");
		return isEven;
	}
	
	/**
	 * 함수가 함수를 반환
	*/
	public YesOrNo enoughMoney() {
		return (value) -> value >= 5000; // 「(value) -> value >= 5000」: 함수
	}
}
