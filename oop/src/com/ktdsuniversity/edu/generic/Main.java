package com.ktdsuniversity.edu.generic;

import student.Student;

public class Main {
	public static void main(String[] args) {
		ScoreArray<Integer> sa1 = new ScoreArray<>("ABC"); // 생성자 파트에선 <> 안 생략 가능
		for (int i = 0; i < 100; i++) {
			sa1.addition((int)(Math.random() * 101)); // int
		}
		
		Object[] intScoreArray = sa1.getScoreArray();
		int intSize = sa1.getSize();
		int intAdd = 0;
		for (int i = 0; i < intSize; i++) {
			// ↓ is a 규칙 위반
//			intAdd += Integer.parseInt(intScoreArray[i]);
			intAdd += Integer.parseInt(intScoreArray[i].toString());
		}
		System.out.println(intAdd);
		
		double intAverage = intAdd / (double) intSize;
		System.out.println(intAverage);
		
		
		
		ScoreArray<String> sa2 = new ScoreArray<>("DEF");
		for (int i = 0; i < 100; i++) {
			sa2.addition((int)(Math.random() * 101) + ""); // String
		}
		
		Object[] stringScoreArray = sa2.getScoreArray();
		int stringSize = sa2.getSize();
		int stringAdd = 0;
		for (int i = 0; i < stringSize; i++) {
			stringAdd += Integer.parseInt(stringScoreArray[i].toString());
		}
		System.out.println(stringAdd);
		
		double stringAverage = stringAdd / (double) stringSize;
		System.out.println(stringAverage);
		
		
		
		ScoreArray<Student> sa3 = new ScoreArray<>("GHI");
		for (int i = 0; i < 100; i++) {
			int score1 = (int)(Math.random() * 101);
			int score2 = (int)(Math.random() * 101);
			int score3 = (int)(Math.random() * 101);
			int score4 = (int)(Math.random() * 101);
			sa3.addition(new Student(score1, score2, score3, score4)); // Student
		}
		
		Object[] studentScoreArray = sa3.getScoreArray();
		int studentSize = sa3.getSize();
		int studentAdd = 0;
		for (int i = 0; i < studentSize; i++) {
			studentAdd += ((Student) studentScoreArray[i]).getSumAllScores();
		}
		System.out.println(studentAdd);
		
		double studentAverage = studentAdd / (double) studentSize;
		System.out.println(studentAverage);
		
//		// 합계도 double로 반드시 하고 싶을 때 (ScoreArray클래스에 int들도 double로 바꿔줘야 함)
//		ScoreArray<Double> sa2 = new ScoreArray<>("DEF");
//		for (int i = 0; i < 100; i++) {
//			sa2.addition(Math.random() * 101); // double
//		}
//		System.out.println(sa2.add()); // double
//		System.out.println(sa2.average()); // double
//		
//		// 합계도 String으로 반드시 하고 싶을 때
//		ScoreArray<String> sa3 = new ScoreArray<>("GHI");
//		for (int i = 0; i < 100; i++) {
//			sa3.addition(Math.random() * 101); // String
//		}
//		System.out.println(sa3.add()); // String
//		System.out.println(sa3.average()); // double
		
	}
}
