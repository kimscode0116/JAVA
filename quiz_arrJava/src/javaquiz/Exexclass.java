package javaquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 0~10 자연수 배열을 중복을 제거하고 오름차순으로 출력하시오.
 */
public class Exexclass {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int N;
		int[] arr;
		int[] cnt;
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			cnt = new int[11];
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				cnt[arr[i]]++;
				// 만약 arr[i]가 7이라면, 7번째 칸에 넣어주고 1로 표시해두면 됨
				// 원 배열을 담는 cnt 배열은 한칸 크게 만들어서 넣어주면 된다..!!!
			}
//			System.out.println(Arrays.toString(arr));

			for(int i=0; i < 11; i++) {
				if(cnt[i] > 0) System.out.print(i);

				// 중복제거 없이 오름차순 출력
//				if (cnt[i] > 0) {
//					for (int j = 0; j < cnt[i]; j++) {
//						System.out.print(i);
//					}
//				}
			}
			System.out.println();
		}
	}
}
