package project0323;

import java.util.Scanner;

public class SaveBox_real {
	public static void main(String[] args) {
		SaveBox2_1 box1 = new SaveBox2_1();

		for(int i = 0; i < 999999; i++) {
			System.out.println("원하시는 메뉴를 선택하세요");
			System.out.println("1 : 입금" + "\n" + "2 : 입금 + 메시지 입력" + "\n"
					+ "종료를 원하시면 crash를 입력하세요");
			
			Scanner s = new Scanner(System.in);
			String userInputString = s.nextLine();
			Scanner s1 = new Scanner(System.in);
			
			int convertNum = Integer.parseInt(userInputString); 
			
			for(int j = 0; j < 3; j++) {
				if(convertNum == 1) {
					int userNum1 = s1.nextInt();
					box1.deposit(userNum1);
				}
			}
		}
}
}

