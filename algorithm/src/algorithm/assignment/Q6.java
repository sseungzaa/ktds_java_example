package algorithm.assignment;

import java.util.Arrays;

/**
 * 전화번호 목록
*/

public class Q6 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				return false;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Q6 q = new Q6();
		
		boolean result = q.solution(new String[]{"12","123","1235","567","88"});
		System.out.println(result);
	}
}
