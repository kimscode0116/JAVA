package practice;

import java.util.Scanner;

public class SaveBox_real {
	public static void main(String[] args) {
		Savebanking box1 = new Savebanking(); //데이터를 쌓아두는 인스턴스는 항상 반복문 밖에 있어야함
		
			boolean isLoop = true;
			while (isLoop){
			System.out.println("원하시는 메뉴를 선택하세요");
	        System.out.println("1 : 입금");
	        System.out.println("2 : 입금 + 메시지 입력");
	        System.out.println("종료를 원하시면 crash를 입력하세요");
	        
			Scanner s1 = new Scanner(System.in);
			String userInputString = s1.nextLine(); 
			Scanner s2 = new Scanner(System.in);
			
				switch(userInputString) {
					case "1":
						System.out.println("금액을 입력하세요.");
						int userNum = s2.nextInt();
						box1.deposit(userNum);
			            box1.deposit2(userNum);
			            break;
			            
					case "2":
						System.out.print("금액을 입력하세요 : ");
						int userNum1 = s2.nextInt();
			            box1.deposit2(userNum1);
			            
			            System.out.print("메시지를 입력하세요 : ");
						String message = s1.nextLine();
						
						System.out.print("▶▶ 메시지가 도착했습니다 : ");
						System.out.println(message);
						System.out.println(" ( " + userNum1 + " 원" + " )");
						System.out.println("==================");
						break;
						
					case "crash":
						int balance = box1.balanceCheck();
						System.out.println("잔액은 " + balance + "원 입니다.");
						isLoop = false;
						
				}
					
			}
		}
	}	
