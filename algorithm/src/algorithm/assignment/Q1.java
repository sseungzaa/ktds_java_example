package algorithm.assignment;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기
*/

public class Q1 {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, (s1, s2) -> {
			if (s1.charAt(n) == s2.charAt(n)) {
				return s1.compareTo(s2);
			}

			return s1.charAt(n) - s2.charAt(n);
		});
		return strings;
	}
	
	public static void main(String[] args) {
		Q1 q = new Q1();
		String[] result1 = q.solution(new String[]{"sun", "bed", "car"}, 1);
		System.out.println(Arrays.toString(result1));
		
		String[] result2 = q.solution(new String[]{"abce", "abcd", "cdx"}, 2);
		System.out.println(Arrays.toString(result2));
	}
}
