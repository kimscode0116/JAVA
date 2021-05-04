package project0319;

import java.util.Arrays;
import java.util.Scanner;

public class Exexclass {
	public static void main(String[] args) {
		int arr[] = {0, 0, 0, 0, 0};
		
		Scanner s = new Scanner(System.in);	
		for(int i = 0; i < arr.length; i++) {
			System.out.println("" + i + "번째 성적을 입력하세요");
			arr[i] = s.nextInt();
		}
		System.out.println("입력된 성적들");
		System.out.println(Arrays.toString(arr));
	}
	}
