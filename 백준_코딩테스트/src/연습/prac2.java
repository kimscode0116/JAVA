package 연습;

import java.util.Arrays;

public class prac2 {
	public static void main(String[] args) {
		prac2 pb = new prac2();
		int[] inputAge = { 66, 61, 22 };
		int answer = pb.solution(inputAge);
		System.out.println(answer);
	}

	public int solution(int[] inputAge) {
		int[] ageinputAge = new int[10];

		for (int i = 0; i < inputAge.length; i++) {
			if (inputAge[i] == 100) {
				ageinputAge[0] += 2;
				ageinputAge[1]++;
			} else if (inputAge[i] < 10) {
				ageinputAge[inputAge[i]]++;
			} else {
				int first = inputAge[i] / 10;
				int second = inputAge[i] % 10;
				ageinputAge[first]++;
				ageinputAge[second]++;
			}
		}
		ageinputAge[6] = (int) Math.ceil((double) (ageinputAge[6] + ageinputAge[9]) / 2);
		ageinputAge[9] = (int) Math.ceil((double) (ageinputAge[6] + ageinputAge[9]) / 2);

		Arrays.sort(ageinputAge);
		int max = ageinputAge[ageinputAge.length - 1];
		return max;
	}
}