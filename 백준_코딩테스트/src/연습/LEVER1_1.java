package 연습;

import java.util.Arrays;

public class LEVER1_1 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2};
		String hand = "right";

		String[] results = new String[numbers.length];

		int lefthand = 0;
		int righthand = 0;
		for(int i =0; i <results.length; i++) {
			results[i] = "";
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("<가야할곳>"+numbers[i]);
			if (numbers[i] % 3 == 1) {
				lefthand = numbers[i];
				results[i] = "L";
			} else if (numbers[i] % 3 == 0) {
				righthand = numbers[i];
				results[i] = "R";

			} else {
				if (Math.abs(numbers[i] - lefthand) == Math.abs(numbers[i] - righthand)) {
					if(hand.length()>=5) {
						results[i] = "R";
					} else results[i] = "L";
				}
				else if(numbers[i]<5) {
					if (Math.abs(numbers[i] - lefthand) < Math.abs(numbers[i] - righthand)) {
						lefthand = numbers[i];
						results[i] = "L";
					}else {
						righthand = numbers[i];
						results[i] = "R";
					}

				} else if(numbers[i]>=5) {
					if (Math.abs(numbers[i] - lefthand) < Math.abs(numbers[i] - righthand)) {
						righthand = numbers[i];
						results[i] = "R";
					}else {
						lefthand = numbers[i];
						results[i] = "L";
					}
				}
			}
			System.out.println("왼손 이동결과 : " +lefthand);
			System.out.println("오른손 이동결과 : " +righthand);
			System.out.println("===================================");

		}
		System.out.print(Arrays.toString(results));

	}
}
