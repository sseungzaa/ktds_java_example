package student;

public class School {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.java = (int) (Math.random() * 101);
		student.python = (int) (Math.random() * 101);
		student.cpp = (int) (Math.random() * 101);
		student.csharp = (int) (Math.random() * 101);
		
		int sum = student.getSumAllScores();
   		double average = student.getAverage();
		double courseCredit = student.getCourseCredit();
 		String grade = student.getABCDF();
		
		System.out.println("총점은 " + sum);
		System.out.println("평균은 " + average);
		System.out.println("학점은 " + courseCredit);
		System.out.println("등급은 " + grade);
	}

}
