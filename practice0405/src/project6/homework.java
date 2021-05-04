package project6;

import java.util.Random;
import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
	System.out.print("사용자 숫자 입력 " + ": ");
	
		int userInputNumber = 0;
		Scanner s = new Scanner(System.in);
		userInputNumber = s.nextInt(10);
		
		int randNum = 0;
		Random r = new Random();
		randNum = r.nextInt(10);

		int sumNumber = userInputNumber + randNum;
		System.out.println(userInputNumber + " + " 
						+ randNum + " = " + sumNumber);

		int minNumber = userInputNumber - randNum;
		System.out.println(userInputNumber + " - "
						+ randNum + " = " + minNumber);

		int mulNumber = userInputNumber * randNum;
		System.out.println(userInputNumber + " * "
						+ randNum + " = " + mulNumber);

		double divNumber = (int)userInputNumber / randNum;
		System.out.println(userInputNumber + " / "
						+ randNum + " = " + divNumber);

		int modNumber = userInputNumber % randNum;
		System.out.println(userInputNumber + " % "
						+ randNum + " = " + modNumber);
	}
}
