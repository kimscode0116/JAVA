package 연습;

import java.util.Arrays;
import java.util.ArrayList;

public class LEVEL1_5 {
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		ArrayList<String> arr = new ArrayList();
		String[] answer = new String[strings.length];
		String[] sortArr = new String[strings.length];
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			String[] nWord = strings[i].split("");
			sortArr[i] = nWord[n];
		}
		Arrays.sort(sortArr);
		for (int i = 0; i < sortArr.length; i++) {
			System.out.println("분류기준" + sortArr[i]);
			for (int j = 0; j < strings.length; j++) {
				String[] nWord = strings[j].split("");
				if (sortArr[i].equals(nWord[n]) && !strings[j].equals(answer[j])) {
					System.out.println("뭐랑 똑같다면?" + nWord[n]);
					answer[i] = strings[j];
					System.out.println("어떤게 더해지고 있나" + strings[j]);
					
					break;
				} else
					continue;
			}
		}
//		for (int i = 0; i < arr.size(); i++) {
//			answer[i] = arr.get(i);
//		}
		System.out.println(Arrays.toString(answer));

	}
}
