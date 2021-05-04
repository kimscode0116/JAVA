package project0319;

import java.util.Arrays;

public class ArrayTest3 {
public static void main(String[] args) {
	int a = 3;
	int b = a; // A의 값을 B에다 넣은거임
	
	System.out.println(b);
	
	b = 10; //여기서 a와 b는 아예 다른 창고에서 숫자를 가져온다.
	System.out.println(a); // 따라서 3이 출된다.
	
	int arr1[] = {1, 2, 3, 4, 5};
	int arr2[] = arr1;
	// arr1에 대한 주소값을 arr2에 넣어주는것(값이 아님!!!)
	// [] 대괄호 없이 그냥 arr1 이름만 있는 경우? 주소이다 (배열)
	// 레퍼런스 라고 함
	System.out.println(arr2[2]);
	
	arr2[2] = 10; // 여기는 arr2가 주소를 가져와서 이렇게 arr2[2]지정되면? 값이다
	
	System.out.println(arr1[2]);
	int b1 = arr1[4]; // 이거는 값을 바꾸는 거임
	b1 = 10;
	
	// 배열을 복사하고 싶을 때는 특별한 방법을 써야함, 복사하면 주소값이 복사되니까
	int arr3[] = {1, 2, 3, 4, 5}; //기존 배열을 복사하는 방법
	int arr4[] = new int[arr3.length];
	System.arraycopy(arr3, 0, arr4, 0, arr3.length);

	arr3[1] = 10;
	arr4[1] = 20;
	
	System.out.println(Arrays.toString(arr3));
	System.out.println(Arrays.toString(arr4));
}
}
