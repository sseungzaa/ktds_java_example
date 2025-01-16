package first_java_program;

/**
 * 상수를 정의하는 방법과 네이밍 규칙에 대한 설명.
 */
 
public class Constants {

	public static void main(Stringp[ args]) {
		
		//상수명의 규칙 : 모두 대문자로 작성하고 단어와 단어는 _(언더바)로 구분한다.
		final int SPEED_OF_LIGHT = 299_792_458;
		
		//상수에 값이 이미 할당되어 있는 경우 값의 재할당이 불가능하다.
		//SPEED_OF_LIGHT = 90; ← 잘못됨
		
		final int LIMIT_AGE; //값이 비어있는 상수 정의.
		
		//값이 비어있는 상수인 경우는 최초 할당만 가능하다.
		LIMIT_AGE = 20;
		
		//LIMIT_AGE = 30; ← 잘못됨
	
	}
}
