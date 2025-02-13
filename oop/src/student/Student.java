package student;

public class Student {
	
	// 학생 평균 및 학점 구하기
	
	int java;
	int python;
	int cpp;
	int csharp;
	
	// 여기서부터 제네릭 강의 때 추가한 내용
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	// 여기까지 제네릭 강의 때 추가한 내용
	
	
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	public double getAverage() {
		int average = (int) ((getSumAllScores() / 4.0) * 100);
		// 68.547125565 * 100
		// 6854.7125565 
		// 6854 / 100.0
		// 68.54
		return average / 100.0;
	}
	
	public double getCourseCredit() {
		//double courseCredit = (getAverage() - 55) / 10.0;
		int courseCredit = (int) ((getAverage() - 55) / 10.0 * 100);
		return courseCredit / 100.0;
	}
	
	public String getABCDF() {
		double grade = getCourseCredit();
		if (grade>=4.1) {
			return "A+";
		}
		else if (grade>=3.6) {
			return "A";
		}
		else if (grade>=3.1) {
			return "B+";
		}
		else if (grade>=2.6) {
			return "B";
		}
		else if (grade>=1.6) {
			return "C";
		}
		else if (grade>=0.6) {
			return "D";
		}
		else {
			return "F";
		}
		
	}
}
