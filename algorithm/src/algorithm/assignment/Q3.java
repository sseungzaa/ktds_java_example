package algorithm.assignment;

import java.util.Arrays;

/**
 * K번째 수
*/

public class Q3 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] temp = null;
		for (int i = 0; i < commands.length; i++) {
			int[] cmd = commands[i];
			temp = new int[cmd[1] - cmd[0] + 1];
			System.arraycopy(array, cmd[0] - 1, temp, 0, temp.length);
			Arrays.sort(temp);

			answer[i] = temp[cmd[2] - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		Q3 q = new Q3();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = q.solution(array, commands);
		System.out.println(Arrays.toString(result));
	}
}
