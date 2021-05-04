package project0323;

import java.util.Scanner;

public class SaveBox2_1 {
   public static void main(String[] args) {
      Savebanking box1 = new Savebanking();

      while(true) {
         System.out.println("원하시는 메뉴를 선택하세요");
         System.out.println("1 : 입금");
         System.out.println("2 : 입금 + 메시지 입력");
         System.out.println("종료를 원하시면 crash를 입력하세요");
         
         Scanner s = new Scanner(System.in);
         String userInputString = s.nextLine();
         int convertNum = Integer.parseInt(userInputString); 

         if(userInputString.equals('1')){
            System.out.println("금액을 입력하세요.");

            Scanner s1 = new Scanner(System.in);
            int userNum = s1.nextInt();
            box1.deposit(userNum);

         } else if(userInputString.equals('2')){
            System.out.print("금액을 입력하세요 : ");

            Scanner s1 = new Scanner(System.in);
            int userNum = s1.nextInt();            
            box1.deposit(userNum);
            
            System.out.print("메시지를 입력하세요 : ");
            String message = s.nextLine();

            System.out.print("▶▶ 메시지가 도착했습니다 : ");
            System.out.print(message);
            System.out.println(" ( " + userNum + " 원" + " )");

         } else if(userInputString.equals("crash")){
            System.out.println("잔액은 " + box1.balanceCheck() + "원 입니다.");
            break;
         } else {
            System.out.println("잘못 누르셨습니다.");
         }
      }
   }
}