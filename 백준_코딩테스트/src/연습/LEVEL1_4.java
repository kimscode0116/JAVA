package 연습;

import java.util.Arrays;

public class LEVEL1_4 {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3 };

		int[] allStudent = new int[n + 1];
		allStudent[0] = 0;

		for (int reset = 1; reset < allStudent.length; reset++) {
			allStudent[reset] = 1;
		}
		for (int i = 0; i < lost.length; i++) {
			allStudent[lost[i]] -= 1;
		}
		for (int i = 0; i < reserve.length; i++) {
			allStudent[reserve[i]] += 1;
		}
		System.out.println(Arrays.toString(allStudent));

		for (int j = 1; j < allStudent.length - 1; j++) {
			if (allStudent[j] == 1) {
				continue;
			} else if (allStudent[j] == 0) {
				if (allStudent[j - 1] == 2) {
					allStudent[j] += 1;
					allStudent[j - 1] -= 1;
				} else if (allStudent[j + 1] == 2) {
					allStudent[j] += 1;
					allStudent[j + 1] -= 1;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < allStudent.length; i++) {
			if(allStudent[i]>=1) {
				cnt++;
			} else continue;
		}
		System.out.println(Arrays.toString(allStudent));
		System.out.println(cnt);

	}
}
