package appDevMidterm;

import java.util.Scanner;

public class Midterm3 {
	public static void main(String[] args) {
		int[][] map;
		int sum, k = 0;

		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();

		int num1 = Integer.parseInt(number.split(" ")[0]);
		int num2 = Integer.parseInt(number.split(" ")[1]);
		map = new int[num1 + 1][num2 + 1];
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				String userInput = sc.nextLine();
				map[i][j] = Integer.parseInt(userInput.split(" ")[j]);
			}
		}
		
		k = sc.nextInt();
		for(int i =0; i < k; i++) {
			sum = 0;
			String text1 = sc.nextLine();
			int x1 = Integer.parseInt(text1.split(" ")[0]);
			int y1 = Integer.parseInt(text1.split(" ")[1]);

			//아래는 같은행, 같은 열의 합을 구하는 계산식 들어와야함
//			for(int a=x1; a<=)
		}
	}
}
