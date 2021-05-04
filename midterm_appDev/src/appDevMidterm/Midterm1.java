package appDevMidterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Midterm1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		int test_case = 0;
		test_case = s.nextInt();

		String[][] arr = new String[test_case][4];

		for (int i = 0; i < test_case; i++) {
			String userInput = "";
			userInput = s2.nextLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = userInput.split("")[j];
			}
		}

		for (int i = 0; i < test_case; i++) {
			int cnt = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j].equals("A")) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
