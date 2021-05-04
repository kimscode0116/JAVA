import java.util.Random;
import java.util.Scanner;

public class ExexClass {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요.");
		
		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		
		Random r1 = new Random();
		int randNumber = r1.nextInt(100) + 1;
		
		System.out.println("사용자가 입력한 숫자 : " + userNumber + ", 랜덤 생성된 숫자 : " + randNumber);
		
		int resultNum = userNumber + randNumber;
		System.out.println("" + userNumber + " + " + randNumber + " = " + resultNum);

		resultNum = userNumber - randNumber;
		System.out.println("" + userNumber + " - " + randNumber + " = " + resultNum);

		resultNum = userNumber * randNumber;
		System.out.println("" + userNumber + " * " + randNumber + " = " + resultNum);
		
		double resultNum2 = (double)userNumber/ randNumber;
		resultNum2 = (double)Math.round(resultNum2 * 100) / 100;
		System.out.println("" + userNumber + " / " + randNumber + " = " + resultNum2);
		
		resultNum = userNumber % randNumber;
		System.out.println("" + userNumber + " % " + randNumber + " = " + resultNum);
		
		userNumber++;
		userNumber--;
//		resultNumber = 1 + 3 * 4 - 2 / 4;
	}
}
