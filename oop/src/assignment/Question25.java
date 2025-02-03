package assignment;

// 1 부터 1000 중 소수(1과 자신으로만 나눌 수 있는 수)만 출력한다.

public class Question25 {
	public static void main(String args[]) {
		
		boolean isPrimeNum = true;
		for(int i = 2; i <= 1000; i++) {
			isPrimeNum = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrimeNum = false;
					break;
				}
			}
			
			if(isPrimeNum) {
				System.out.println(i);
			}
		}
	}
	
}
