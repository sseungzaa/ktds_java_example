package assignment;

// 1 부터 50 중 30~39 까지의 숫자만 출력한다.

public class Question22 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 50 ; i++) {
			if(i >= 30 && i <= 39) {
				System.out.println(i);
			}
		}	
	}

}
