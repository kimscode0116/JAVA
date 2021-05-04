package project0323;

import java.util.Arrays;
import java.util.Random;

public class Exexclass03 {
	public static void main(String[] args) {
		int[] score = new int[10];
		
		//score에 점수를 넣어줘
		inputNum(score); //inputnum에서 받아온 애들을 score에다가 넣어줘!
		System.out.println(Arrays.toString(score));

		//score에 총합을 구해줘
		calcScore(score);
		
//		int[] score2 = new int[20];
//		inputNum(score);
//		System.out.println(Arrays.toString(score));
	}
	public static void inputNum(int[]s) { //배열에다가 랜덤한 숫자를 넣어주는 역할만 수행! 걔 이름은 inputnum이야
		Random r1 = new Random();
		for(int i = 0; i < s.length; i++) {
			s[i] = r1.nextInt(101);
		}
	}
	
	public static void calcScore(int[]s) { //배열의 총합을 구해주는 역할만 수행! 걔 이름은 clacScore야
		int total = 0;
		for(int i = 0; i < s.length; i++) {
			total = total + s[i];
		}
		System.out.println("총합 : " + total);
	}
}