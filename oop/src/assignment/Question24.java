package assignment;

// 구구단 2 ~ 9 단을 출력한다.

public class Question24 {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}

}
