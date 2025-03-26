package algorithm.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 튜플
*/

public class Q5 {
public int[] solution(String s) {
		
		String[] sets = s.split("\\},\\{");
		String[][] setArrays = new String[sets.length][];
		for (int i = 0; i < sets.length; i++) {
			setArrays[i] = sets[i].replaceAll("[\\{\\}]", "").split(",");
		}

		Arrays.sort(setArrays, (a1, a2) -> a1.length - a2.length);

		int[] answer = new int[setArrays.length];
		List<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < setArrays.length; i++) {
			for (int j = 0; j < setArrays[i].length; j++) {
				int num = Integer.parseInt(setArrays[i][j]);
				if (!answerList.contains(num)) {
					answerList.add(num);
					answer[i] = num;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q5 q = new Q5();
		int[] result = q.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
		System.out.println(Arrays.toString(result));
	}
}
