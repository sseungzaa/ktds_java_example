package assignment;

// 구구단 2, 3단을 출력한다.

public class Question23 {
	public static void main(String[] args) {
		for(int i=2; i<4; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}

}
