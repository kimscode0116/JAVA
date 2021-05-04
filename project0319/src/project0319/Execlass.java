package project0319;

import java.util.Arrays;
import java.util.Random;

public class Execlass {
public static void main(String[] args) {
	int arr[] = new int[10];
	int total = 0;
	double average = 0;
	
	Random r = new Random();
	for(int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt(100)+1;
		total = total + arr[i];
		average = (double)total / arr.length;
		average = (double)Math.round(average * 100) / 100;
	}
	Arrays.sort(arr);
	System.out.println("입력된 숫자들" + Arrays.toString(arr));
	System.out.println("총 합계는?" + total);
	System.out.println("총 평균은?" + average);
}
}
