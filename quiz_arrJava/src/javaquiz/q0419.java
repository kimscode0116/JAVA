package javaquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q0419 {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/input.txt"));

		int Total = 0;
		int[][] testArr;
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();
		int T2 = s.nextInt();
		testArr = new int[T][T2];

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < T2; j++) {
				testArr[i][j] = s.nextInt();
			}
		}

		int turn = s.nextInt();
		for (int i = 0; i < turn; i++) {
			Total = 0;
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();

			for (int a = x1-1; a < x2; a++) {
				for (int b = y1-1; b < y2; b++) {
					Total += testArr[a][b];
				}
			}
			System.out.println(Total);
		}
	}
}
