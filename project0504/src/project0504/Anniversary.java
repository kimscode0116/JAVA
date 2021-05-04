package project0504;

import java.util.Scanner;

public class Anniversary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Anniversary_dayclass d1 = null;
	while(true) {
		System.out.println("원하시는 기능을 선택하세요");
		System.out.println("1: 기념일 입력");
		System.out.println("2: D-DAY 출력");
		System.out.println("EXIT : 종료");
	
		String userInput = sc.nextLine();
		if(userInput.equals("1")) {
			//기념일 입력
			System.out.println("기념일을 입력해주세요");
			String inputDateString = sc.nextLine();
			d1 = new Anniversary_dayclass(inputDateString);
		}
		else if (userInput.equals("2")) {
			//d-day 출력
			d1.calulaionDDAY();
			System.out.println(d1);
		}
		else if(userInput.equals("exit")) {
			break;
		}
 	}
}
}
