package javaquiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q04192 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][]arr = new int[x][y];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int turn = sc.nextInt();
		
		for(int test_case = 0; test_case<turn; test_case++) {
			int sum = 0;
			int X1 = sc.nextInt();
			int Y1 = sc.nextInt();
			int X2 = sc.nextInt();
			int Y2 = sc.nextInt();
			
			for(int i = X1-1; i < X2; i++) {
				for(int j = Y1-1; j < Y2; j++) {
					sum += arr[i][j]; 
				}
			}
			System.out.println(sum);
		}
	}
}
