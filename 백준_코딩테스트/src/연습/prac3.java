package 연습;

import java.util.Scanner;

public class prac3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int turnNum = sc.nextInt();
		String fullNumber = "";
		
		for(int i = 1; i < 9999; i++) {
			fullNumber += i;
		}
		
		System.out.println(fullNumber.charAt(turnNum));
	}
}