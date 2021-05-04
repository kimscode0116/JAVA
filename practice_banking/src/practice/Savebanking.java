package practice;

public class Savebanking {
   int coins = 0;
   
   public void deposit(int value) {
      System.out.println("딸그랑! ▶ " + value);
      System.out.println("==================");
   }
   public void deposit2(int value) {
	   this.coins = this.coins + value;
	   }
   public int balanceCheck() {
      return this.coins;
   }
   
}