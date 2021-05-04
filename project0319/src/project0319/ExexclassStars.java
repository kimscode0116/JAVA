package project0319;

import java.util.Arrays;

public class ExexclassStars {
public static void main(String[] args) {
	int a[] = {0,0,0,0}; // 몇 칸인지를 내가 보여주고 0으로 값을 리셋해주는거
	int b[] = new int[5]; // 내가 만든 배열이 5칸이라고 선언해주는 것
	
	System.out.println(a[3]);
	
	a[0] = 10;
	a[0]++;
	
	System.out.println(a[0]);
	
	a[1] = 3;
	a[2] = a[0] + a[1];
	
	System.out.println(a[2]);
	
	a[3] = 50;
//	
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
	System.out.println(Arrays.toString(a));
	
	int a1 = 0, b= 0, c = 0, d = 0;
	System.out.println(a);
}
}
