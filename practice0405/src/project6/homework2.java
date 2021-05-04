package project6;

import java.util.Random;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
	
		int userInputNumber = 0;
		Scanner s = new Scanner(System.in);
		userInputNumber = s.nextInt(10);
		
		int randNum = 0;
		Random r = new Random();
		randNum = r.nextInt(10);

		int sumNumber = userInputNumber + randNum;
		System.out.print(sumNumber);

		int minNumber = userInputNumber - randNum;
		System.out.println(minNumber);

		int mulNumber = userInputNumber * randNum;
		System.out.println(mulNumber);

		double divNumber = (int)userInputNumber / randNum;
		System.out.println(divNumber);

		int modNumber = userInputNumber % randNum;
		System.out.println(modNumber);
	}
}
