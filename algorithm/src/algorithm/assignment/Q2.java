package algorithm.assignment;

import java.util.Arrays;

/**
 * 정수 내림차순으로 배치하기
*/

public class Q2 {
	public long solution(long n) {
		String[] nArr = (n + "").split("");

		Arrays.sort(nArr, (s1, s2) -> s2.compareTo(s1));

		String result = "";
		for (int i = 0; i < nArr.length; i++) {
			result += nArr[i];
		}

		long answer = Long.parseLong(result);
		return answer;
	}
	
	public static void main(String[] args) {
		Q2 q = new Q2();
		long result = q.solution(118372);
		System.out.println(result);
	}
}
