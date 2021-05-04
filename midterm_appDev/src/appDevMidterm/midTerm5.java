package appDevMidterm;

import java.util.Scanner;

public class midTerm5 {
	public static void main(String[] args) {
		final int bus45 = 45;
		final int bus25 = 25;
		int cost45 = 0;
		int cost25 = 0;

		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		if(userInput%bus25==0) {
			System.out.println(cost45 + " : " + userInput/bus25);
			return;
		}
		
		while(true) {
			//45명 이상이면 무조건 여기에 걸림
			if(userInput>=bus45) {
				userInput = userInput-bus45;
				cost45++;
				
				if(userInput%bus25 == 0) {
					System.out.println(cost45 + " : " + userInput/bus25);
					break;
				}
			}
			//0명~44명까지는 무조건 여기에 걸림
			else { 
				if(userInput<=bus25) { //0명~25명까지는 여기에 걸리고
					cost25++;
					System.out.println(cost45 + " : " + cost25);
					break;
				}
				else { //26명~44명까지는 여기에 걸리게 됨
					cost45++;
					System.out.println(cost45 + " : "+ cost25);
					break;
				} 
			}
		}
	}
}
