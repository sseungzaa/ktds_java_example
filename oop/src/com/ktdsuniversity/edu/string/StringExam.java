package com.ktdsuniversity.edu.string;

public class StringExam {
	
	public static void contains() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println(isSeoul);
	}
	
	public static void endsWith() {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.endsWith("176");
		System.out.println(isSeoul);
	}
	
	public static void equals() {
		String name = "ktdsuniversity";
		boolean isEqual = name.equals("ktdsUniversity");
		System.out.println(isEqual);
	}
	
	public static void equalsIgnoreCase() {
		String name = "ktdsuniversity";
		boolean isEqual = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEqual);
	}
	
	public static void format() {
		String format = "%s에서 교육하는 %s과정";
		String str = String.format(format,  "ktdsuniversity", "Java");
		System.out.println(str);
	}
	
	public static void formatJava() { // Java 15부터만 가능
		String format = "%s에서 교육하는 %s과정";
		String str = format.formatted("ktdsuniversity", "Java");
		System.out.println(str);
	}
	
	public static void indexOfLower() {
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('c');
		System.out.println(letterCIndex);
	}
	
	public static void indexOfUpper() {
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('C');
		System.out.println(letterCIndex);
	}
	
	public static void indexOfDEF() {
		String alphabets = "abcdefg";
		int letterDEFIndex = alphabets.indexOf("def");
		System.out.println(letterDEFIndex);
	}
	
	public static void isBlank() {
		String str = "    ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
	}
	
	public static void isEmpty() {
		String str = "    ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
	}
	
	public static void join() {
		String message = "안녕하세요";
		String name = "홍길동 님";
		String helloMessage = String.join(", ", message, name);
		System.out.println(helloMessage);
	}
	
	public static void lastIndexOfA() {
		String message = "abcdefgijkb";
		int letterALastIndex = message.lastIndexOf("a");
		System.out.println(letterALastIndex);
	}
	
	public static void lastIndexOfJJ() {
		String message = "abcdefgijkb";
		int letterJJLastIndex = message.lastIndexOf("jj");
		System.out.println(letterJJLastIndex);
	}
	
	public static void length() {
		String message = "abcdefgijkb";
		int length = message.length();
		System.out.println(length);
	}
	
	public static void matches() {
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber);
	}
	
	public static void replace() {
		String message = "안녕하세요, 홍길동 님, 안녕히 가세요, 홍길동 님";
		message = message.replace("홍길동", "ktds");
		System.out.println(message);
	}
	
	public static void replaceAll() {
		String phone = "010-1234-1234";
		phone = phone.replaceAll("[^0-9]", "");
		System.out.println(phone);
	}
	
	public static void split() {
		String phone = "010-1234-1234";
		String[] phoneArea = phone.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
	}
	
	public static void startsWith() {
		String phone = "+82-010-1234-1234";
		boolean isKoreaNum = phone.startsWith("+82");
		System.out.println(isKoreaNum);
	}
	
	public static void substringYear() {
		String datetime = "2025-02-04 16:50:30";
		String year = datetime.substring(0, 4);
		System.out.println(year);
	}
	
	public static void substringHour() {
		String datetime = "2025-02-04 16:50:30";
		String hour = datetime.substring(11, 13);
		System.out.println(hour);
	}
	
	public static void substringTime() {
		String datetime = "2025-02-04 16:50:30";
		String time = datetime.substring(11);
		System.out.println(time);
	}
	
	public static void trim() {
		String datetime = "   2025-02-04 16:50:30   ";
		System.out.println(datetime.length());
		System.out.println(datetime);
		datetime = datetime.trim();
		System.out.println(datetime.length());
		System.out.println(datetime);
	}
	
	public static void valueOf() {
		String iStr = String.valueOf(1);
		System.out.println(iStr);
	}
	
	public static void toUpper() {
		String name = "ktdsUniversity";
		String upperName = name.toUpperCase();
		System.out.println(upperName);
	}
	
	public static void toLower() {
		String name = "ktDSuniversity";
		String lowerName = name.toLowerCase();
		System.out.println(lowerName);
	}
	
	public static void printFileName() {
		// Java에서 \(백슬래시)는 escape code
		// 문자열 내부에서 표현할 수 없는 특수문자들을 입력하기 위한 방법
		
		String escape = "    My name is \"S W Bang\" ";
		System.out.println(escape);
		
		escape = "    My name is 'S W Bang' ";
		System.out.println(escape);
		
		escape = "    My\n name\t is 'S W\n     \r\t Bang' ";
		System.out.println(escape);
		
		String path = "C:\\dev_program\\eclipse\\eclipse.exe";
		System.out.println(path);
		
		// lastIndexOf, substring을 이용해 "eclipse.exe"만 출력
		int letterECLastIndex = path.lastIndexOf("ec");
		// System.out.println(letterECLastIndex);
		String word1 = path.substring(letterECLastIndex);
		System.out.println(word1);
		
		// "eclipse.exe"에서 indexOf, substring을 이용해 "eclipse"만 출력
		
		int letterDotIndex = word1.indexOf(".");
		// System.out.println(letterDotIndex);
		String word2 = word1.substring(0, letterDotIndex);
		System.out.println(word2);
		
		// "eclipse.copy.exe"에서 indexOf, lastIndexOf, substring을 이용해 "copy"만 출력
		
		
	}
	
	public static void main(String[] args) {
		
		StringExam.contains();
		
		StringExam.split();
		
	}

}