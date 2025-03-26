package algorithm.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 가장 큰 수
*/

public class Q4 {
	public String solution(int[] numbers) {
		String answer = Arrays.stream(numbers)
							  .boxed()
							  .map(String::valueOf)
							  .sorted((s1, s2) -> {
								int num1 = Integer.parseInt(s1 + s2);
								int num2 = Integer.parseInt(s2 + s1);
								return num2 - num1;
							  })
							  .collect(Collectors.joining());
		// case [0, 0, 0, 0]
		return answer.charAt(0) == '0' ? "0" : answer;
	}

	public static void main(String[] args) {
		Q4 q = new Q4();
		String result1 = q.solution(new int[]{6, 10, 2});
		// < = Negative(음수) (뒷 숫자가 더 크다)
		// > = Positive(양수) (앞 숫자가 더 크다)
		// (s2 + s1)106 - (s1 + s2)610 = NEGATIVE
		//   s1(6)을 앞으로.
		//      6 10 2
		// (s2 + s1)26 - (s1 + s2)62 = NEGATIVE
		//   s1(6)을 앞으로.
		//      6 10 2
		// (s2 + s1)102 - (s1 + s2)210 = NEGATIVE
		//   s1(2)을 앞으로.
		//      6 2 10
		System.out.println(result1);
		
		String result2 = q.solution(new int[]{3, 30, 34, 5, 9});
		System.out.println(result2);
	}
}
