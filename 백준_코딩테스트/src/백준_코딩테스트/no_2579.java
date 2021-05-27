package 백준_코딩테스트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class no_2579 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n + 1];
		int [] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
      System.out.println(Arrays.toString(arr));

		dp[0] = 0;
		dp[1] = arr[1];
		if (n >= 2) {
			dp[2] = Math.max(arr[2], dp[1] + arr[2]);
		}

		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
		}
//      System.out.println(Arrays.toString(arr));
//      System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}

}