package javaquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Exexclass2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 반복 횟수
		int N;
		int[] arr;
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // 배열 크기
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));

			for(int h = 0; h < arr.length; h++) {
				if(h != arr.length -1 && arr[h]==arr[h+1]) {
					continue;
				} else System.out.print(arr[h]);

			} System.out.println(" 쨘");
			System.out.println();
		}
		System.out.println();
	}
}
