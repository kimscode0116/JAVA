package javaquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class q2 {
//	public static int value1(int n) {
//		if(n <= 1) {
//			return n;
//		}
//		else return n * value1(n-1);
//	}

	public static void main(String[] args) throws FileNotFoundException {
		int zero;
		System.setIn(new FileInputStream("src/inputDC.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int[] arr;

		for (int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
//				for(int j = 0; j < arr.length; j++) {
//					if(arr[j+1] == arr[j]) {
//						arr[j] = (Integer) null;
//					}
//				}
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println(Arrays.toString(arr));


		}
	}
}
