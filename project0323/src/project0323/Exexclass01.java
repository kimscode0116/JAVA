package project0323;

import java.util.Arrays;
import java.util.Random;

public class Exexclass01 {
	public static void main(String[] args) {
	//	int[][] number = new int[4][4];
		int[][] number = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};	
		Random r = new Random();
		
		for(int i=0; i < number.length -1; i++) {
			for(int j = 0; j < number[0].length-1; j++) {
				number[i][j] = r.nextInt(200);
			}
		} 
		System.out.println("3X3 배열");
		for(int i=0; i < number.length -1; i++) {
			for(int j = 0; j < number[0].length-1; j++) {			
				System.out.print("(" + i +","+ j + ") : " + number[i][j] + "   ");
			}
			System.out.println();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				number[i][3] = number[i][3] + number[i][j]; //x축 합계
				number[3][j] = number[3][j] + number[i][j]; //y축 합계
				number[3][3] = number[3][3] + number[i][j]; //총합계
			}
		}
		
		 System.out.println("4x4 배열");
		for(int i = 0; i < number.length; i++) {
			for(int j = 0; j < number[0].length; j++) {		
				System.out.print("(" + i +","+ j + ") : " + number[i][j] + "   ");
			}
			System.out.println();
		}
	}
}