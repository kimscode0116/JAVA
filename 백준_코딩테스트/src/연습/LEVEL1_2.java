package 연습;

import java.util.ArrayList;
import java.util.Arrays;

public class LEVEL1_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
//		int[] answer = {};

//        for(int i = 0; i <answer.length; i++) {
//            answer[i] = -1;
//        }
		ArrayList<Integer> answerBefore = new ArrayList();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				} else {
					break;
				}
			}
			if(arr[i] != -1) {
				answerBefore.add(arr[i]);
			} else continue;
		}
		int[] answer = new int[answerBefore.size()];
		for(int i = 0; i < answerBefore.size(); i++) {
			answer[i] = answerBefore.get(i);
		}
		
	}
}
