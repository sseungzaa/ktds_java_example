package com.ktdsuniversity.edu.staticexam;

/**
 * 숫자와 관련된 유틸리티 메소드를 관리하는 클래스
 * 예시) 문자 -> 숫자
 * 		문자가 숫자로만 이루어져 있는지 확인
 * 		문자가 실수로만 이루어져 있는지 확인
 * 		숫자 -> 문자
 */

public class NumberUtils {
	
	public static int convertToInt(String source, int defaultValue) {
		
		if(NumberUtils.isDecimalFormat(source)) {
			return NumberUtils.convertToInt(source);
		}
		
		return 0;
	}
	
	/**
	 * 문자를 숫자로 변경
	 * @param source - 숫자로 변경하고 싶은 문자
	 * @return 숫자
	 */
	
	public static int convertToInt(String source) {
		int num = Integer.parseInt(source);
		return num;
	}
	
	/**
	 * 문자가 정수로만 이루어져 있는지 확인
	 * @param source - 정수인지 확인하고 싶은 문자
	 * @return 정수로만 이루어져 있다면 true 반환
	 */
	
	public static boolean isDecimalFormat(String source) {
		boolean isDecimalFormat = source.matches("^[0-9]+$");
		// ^:뒤에 붙는 것으로 시작한다, []:그룹, +:연속, $:끝난다
		return isDecimalFormat;
	}

}
