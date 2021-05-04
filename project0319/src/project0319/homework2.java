package project0319;

import java.util.Arrays; 
import java.util.Random;

public class homework2 {
	public static void main(String[] args) {
		int arr[] = new int[30];
		int arrNum = 0;
		
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			}
		System.out.println(Arrays.toString(arr)); //소팅 전 배열 출력
	
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > arr[j+1]) {
				int arrNum = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = arrNum;
			}
		} 
		System.out.print(Arrays.toString(arr));
	
	}
}

