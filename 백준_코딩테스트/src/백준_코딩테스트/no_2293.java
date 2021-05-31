package 백준_코딩테스트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class no_2293 {
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/input2.txt"));
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 
		int k = sc.nextInt(); 

		int[] arr = new int[n + 1];
		int[] dp = new int[k + 1];
		dp[0] = 1;
		
		for(int i = 0; i < n; i++) {
			int coin = sc.nextInt(); // 동전 단위 하나씩 받아옴
			for(int j = 1; j < k+1; j++) { //1부터 10까지 반복문 돈다
				if(j >= coin) //코인의 가치보다 반복문이 클때
					dp[j] += dp[j - coin];
			}
		}

		System.out.println(dp[k]);
	}

}
