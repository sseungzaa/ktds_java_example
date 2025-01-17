package first_java_program;

public class ScorePractice {
	public static void main(String[] args) {
		int korScore = (int) (Math.random() * 101);
		int engScore = (int) (Math.random() * 101);
		int mathScore = (int) (Math.random() * 101);
		int progScore = (int) (Math.random() * 101);
		
		int sum = korScore + engScore + mathScore + progScore;
		int average = ( korScore + engScore + mathScore + progScore ) / 4;
		System.out.println(sum);
		System.out.println(average);
		
		//국 영 수 프 합계와 평균을 각각 계산해 할당하고
				// 아래 기준에 따라 성적을 출력
				// 평균 95 이상 : A+, 평균 90 이상 : A
				// 평균 85 이상 : B+, 평균 80 이상 : B
				// 평균 75 이상 : C+, 평균 70 이상 : C
				// 평균 70 미만 : F
		
		boolean gradeAP = average >= 95 && average <= 100;
		boolean gradeA = average >= 90 && average < 95;
		boolean gradeBP = average >= 85 && average < 90;
		boolean gradeB = average >= 80 && average < 85;
		boolean gradeCP = average >= 75 && average < 80;
		boolean gradeC = average >= 70 && average < 75;
		boolean gradeF = average < 70;
		
		/*
		if ( gradeAP ) {
			System.out.println("A+입니다 ");
		}
		else if ( gradeA) {
			System.out.println("A입니다 ");
		}
		else if ( gradeBP) {
			System.out.println("B+입니다 ");
		}
		else if ( gradeB) {
			System.out.println("B입니다 ");
		}
		else if ( gradeCP) {
			System.out.println("C+입니다 ");
		}
		else if ( gradeC) {
			System.out.println("C입니다 ");
		}
		else if ( gradeF) {
			System.out.println("F입니다 ");
		*/
		
		if ( gradeAP ) {
			System.out.println("A+입니다 ");
		}
		else if ( gradeA) {
			System.out.println("A입니다 ");
		}
		else if ( gradeBP) {
			System.out.println("B+입니다 ");
		}
		else if ( gradeB) {
			System.out.println("B입니다 ");
		}
		else if ( gradeCP) {
			System.out.println("C+입니다 ");
		}
		else if ( gradeC) {
			System.out.println("C입니다 ");
		}
		else if ( gradeF) {
			System.out.println("F입니다 ");
		}
	}

}
