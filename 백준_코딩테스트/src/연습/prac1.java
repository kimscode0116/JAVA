package 연습;

import java.util.Arrays;

public class prac1 {
	public static void main(String[] args) {
		int N = 4;
		int M = 3;
		int k = 2;

		int[] answer = new int[N + 1];
		int[] arr = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			arr[i] = i;
		}

		answer[0] = 0;
		answer[1] = 1;

		boolean result = true;

//		while (result) {
//			int next = 0;
//			for (int j = 1; j <= answer.length - 1; j++) {
//				if (answer[j] % 2 == 1) {
//					next = k+1;
//					System.out.println("홀수" + next);
//					break;
//				} else {
//					next = answer.length-k;
//					System.out.println("짝수" + next);
//					break;
//				}
//			}
//			answer[next]++;
//			cnt++;
//			System.out.println(next+" : "+answer[next]);
//
//			System.out.println(cnt);
//			System.out.println("--------");
//
//			
//			for (int i = 0; i < answer.length; i++) {
//				if (answer[i] == M) {
//					System.out.println("3되었으니까 그만하쇼 stop");
//					result = false;
//					break;
//				}
//				else continue;
//			}
//		}
		int next = 1;
		int finalnext = 0;
		int cnt = 0;

		while (result) {

			System.out.println("이번순서 : " + next);
			for (int j = next; j <= answer.length - 1; j++) {
				if (answer[next] % 2 == 1) {
					next += k;
					System.out.println("홀수" + next);
				} else {
					next -= -k;
					System.out.println("짝수" + next);
				}
				
				if(next>=answer.length) {
					next = next-N;
					break;
				};
				break;
			}

			answer[next]++;
			cnt++;
			System.out.println(next + " : " + answer[next]);
			System.out.println(cnt);
			System.out.println(Arrays.toString(answer));

			for (int i = 0; i < answer.length; i++) {
				if (answer[i] == M) {
					System.out.println("3되었으니까 그만하쇼 stop");
					result = false;
					break;
				} else
					continue;
			}
			System.out.println("--------");

		}
		System.out.println(cnt);

	}
}
