package project0323;

import java.util.Scanner;

public class SaveBox2 {
	public static void main(String[] args) {
		SaveBox2_1 box1 = new SaveBox2_1();
		SaveBox2_1 box2 = new SaveBox2_1();
		
		for(int i = 0; i < 999999; i++) {
		System.out.println("원하시는 메뉴를 선택하세요.");
		System.out.println("1 : 입금" + "\n" + "2 : 입금 + 메시지 입력" + "\n"
						+ "종료를 원하시면 crash를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		String userInputString = s.nextLine();		
		 Scanner s1 = new Scanner(System.in);
		 Scanner s2 = new Scanner(System.in);

		int convertNum = Integer.parseInt(userInputString); 
		// 문자를 숫자로 바꿔준다 ex ("123" => 123) (123 => "123")
		
		if(convertNum == 1) {	
			 System.out.println("금액을 입력하세요.");
			 int userInputmoney = s1.nextInt();
			 System.out.println("딸그랑! " + userInputmoney);
			 box1.deposit(userInputmoney);
		} 
				
		else if(convertNum == 2) {
			System.out.print("금액을 입력하세요");
			Scanner s3 = new Scanner(System.in);
			int userInputmoney2 = s3.nextInt();
			box1.deposit(userInputmoney2);
		
			System.out.print("메시지를 입력하세요");
			Scanner s4 = new Scanner(System.in);
			String massage = s4.nextLine();
			System.out.println("당신이 입력한 메시지는?" + massage);
			System.out.println("당신이 입력한 금액은?" + userInputmoney2);
		}
//		String userValue = s2.nextLine();
//		if(userValue == "crash") {
//			userValue == "3";
//		}
//		if(userInputString == "crash") {
//			box1.withdraw();
//			break;
//		} 
		if(convertNum == 3) {
			box1.withdraw();
			break;
		}
//		내일 여기 3대신 crash를 입력했을대 3으로 인식할 수 있는 명령문 만들어 주면 됨
	
}
	}}
//userInputString=="crash"
