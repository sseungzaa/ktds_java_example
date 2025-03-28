package com.ktdsuniversity.edu.staticexam;

/*
	---isValidAge(int age, int min, int max) 클래스 메소드를 만들고
	age의 값이 min보다 크고 max 보다 작으면 true를,
	아니면 false를 반환하도록 작성하고 호출해보세요---
	boolean 써야겠고
	age가 min보다 큰가요?라는 질문
	age가 max보다 작은가요?라는 질문
*/



/*
	---getCourseCredit(double average) 클래스 메소드를 만들고
	average의 값을 4.5 만점 기준의 학점을 반환하도록 작성하고 호출해보세요---
	
*/

public class PracticeMain {
	public static void main(String[] args) {
		boolean isValidAge = Practice.isValidAge(10, 0, 101);
		System.out.println(isValidAge); // true
		
		isValidAge = Practice.isValidAge(200, 0, 101);
		System.out.println(isValidAge); // false
		
		isValidAge = Practice.isValidAge(101, 0, 101);
		System.out.println(isValidAge); // false
		
		double courseCredit = Practice.getCourseCredit(85.19);
		System.out.println(courseCredit); // 3.0
		
		courseCredit = Practice.getCourseCredit(39.11);
		System.out.println(courseCredit); // 1.0
	}
	
}
