package project0517;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.io.FileInputStream;


class Solution3 {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		
		System.setIn(new FileInputStream("src/sample_input.txt"));

		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();

			char[] E = sc.nextLine().toCharArray();
			/*
			 * my code
			 */
			System.out.println("E len ="+E.length);
			Stack<String> s = new Stack<String>();
			int size = Integer.MAX_VALUE;
			
			try {
				for (int i = 1; i < E.length; i++) {
					if (E[i] == '(') {
						if (i == N)
							size = s.size();

						s.push(String.valueOf(E[i]));

					} else {
						s.pop();

						if (s.size() == size) {
							AnswerN = i;
							size = Integer.MAX_VALUE;
						}

					}
				}
				
			} catch (EmptyStackException e) {
				AnswerN = 0;
				
			} finally {
				if (s.size() > 0)
					AnswerN = 0;
				
			}

			// int[] C = new int[E.length];
			//
			// for (int i = 1; i < E.length; ++i) {
			// if (E[i] == '(') {
			// C[i] = C[i - 1] - 1;
			// }
			// if (E[i] == ')') {
			// C[i] = C[i - 1] + 1;
			// }
			// }
			//
			// for (int k = N + 1; k < E.length; ++k) {
			// if (C[k] == C[N] + 1) {
			// AnswerN = k;
			// break;
			// }
			// }
			//
			// if (C[N] > 0) {
			// AnswerN = 0;
			// }

			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
