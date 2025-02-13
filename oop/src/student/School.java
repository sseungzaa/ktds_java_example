package student;

public class School {
	public static void main(String[] args) {
		
		
//		원래 ↓ 이건데 제네릭 강의 때 생기게 되는 에러 고칠려고 (0, 0, 0, 0) 붙여놓음
//		Student student = new Student();
		Student student = new Student(0, 0, 0, 0);
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
