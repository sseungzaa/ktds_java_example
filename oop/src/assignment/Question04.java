package assignment;

/*
1 부터 10000 사이에 몇 개의 소수(Prime Number)가 있는지 세어 출력하는
메소드를 만들고 호출해보세요.
*/

public class Question04 {
	public void primeNum() {
		
		int count = 0;
		
		boolean isPrimeNum = true;
		int j = 0;
		
		for(int i = 2 ; i <= 10000 ; i++) {
			isPrimeNum = true;
			for(j = 2; j < i ; j++) {
				if(i % j == 0) {
					isPrimeNum = false;
					break;
				}
			}
			if(isPrimeNum) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		Question04 ipn = new Question04();
		ipn.primeNum();		
	}
}
