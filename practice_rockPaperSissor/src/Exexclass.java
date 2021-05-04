import java.util.Random;
import java.util.Scanner;
// 가위보게임 만들기
public class Exexclass {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임 " + " ▶ 가위(1) / 바위(2) / 보자기(3) " );
							
		Scanner s1 = new Scanner(System.in);
		int userInputNumber = s1.nextInt();
		
		if (userInputNumber == 1) {
			System.out.println("사용자는 가위를 냈습니다.");
		} else if(userInputNumber == 2) {
			System.out.println("사용자는 바위를 냈습니다.");
		} else if(userInputNumber == 3) {
			System.out.println("사용자는 보를 냈습니다.");
		}
		
		Random r1 = new Random();
		int randNumber = r1.nextInt(3)+1;
		if (randNumber == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if(randNumber == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if(randNumber == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		if (userInputNumber < 1 || userInputNumber >3) {
			System.out.println("1~3의 숫자를 입력하세요");
		} else if (userInputNumber == 1 && randNumber == 1) {
			System.out.println("비겼습니다");
		} 
		
		else if (userInputNumber ==1 && randNumber == 2) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (userInputNumber ==1 && randNumber == 3) {
			System.out.println("사용자가 이겼습니다");
		} else if (userInputNumber ==2 && randNumber == 1) {
			System.out.println("사용자가 이겼습니다");
		} else if (userInputNumber ==2 && randNumber == 2) {
			System.out.println("비겼습니다");
		} else if (userInputNumber ==2 && randNumber == 3) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (userInputNumber ==3 && randNumber == 1) {
			System.out.println("컴퓨터가 이겼습니다");
		} else if (userInputNumber ==3 && randNumber == 2) {
			System.out.println("사용자가 이겼습니다");
		} else if (userInputNumber ==3 && randNumber == 3) {
			System.out.println("비겼습니다");
		}
	}
}
