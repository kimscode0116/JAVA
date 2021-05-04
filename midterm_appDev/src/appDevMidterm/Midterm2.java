package appDevMidterm;

import java.util.Arrays;
import java.util.Scanner;

public class Midterm2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int test_case = s1.nextInt();

		String[][] input = new String[test_case][];

		for (int i = 0; i < test_case; i++) {
			String userInput = "";
			userInput = s2.nextLine();
			input[i] = userInput.split(" ");
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length - 1; j++) {
				if (Integer.parseInt(input[i][j]) > Integer.parseInt(input[i][j + 1])) {
					String temp = input[i][j];
					input[i][j] = input[i][j + 1];
					input[i][j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
