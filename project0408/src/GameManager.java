import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1("가")}; // 
		Enemy[] enemy = {new EnemyType1("1")}; //, 
		Player3[] player3 = {new ArcherEunhye("ArcherEunhye")}; // 
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("" + (i + 1) + "턴\n\n");
			// player 턴
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
				if (player[playerIndex].isLive() && player3[attackTarget].isLive()) {
					player[playerIndex].attack1(player3[attackTarget]);		
				}	
			}
			// enemy 턴
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget1 = r.nextInt(enemy.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget1].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget1]);
				}
				if (enemy[enemyIndex].isLive() && player3[attackTarget1].isLive()) {
					enemy[enemyIndex].attack(player3[attackTarget1]);
				}
			}
			//player3 턴
			for (int player3Index = 0; player3Index < player3.length; player3Index++) {
				int attackTarget1 = r.nextInt(player3.length);
				if (player3[player3Index].isLive() && player[attackTarget1].isLive()) {
					player3[player3Index].attack(player[attackTarget1]);
				}
				if (player3[player3Index].isLive() && enemy[attackTarget1].isLive()) {
					player3[player3Index].attack(enemy[attackTarget1]);
				}
			}
			
			// 게임 종료 여부 확인
			boolean isPlayerLive = false;
			for (int playerIndex1 = 0; playerIndex1 < player.length; playerIndex1++) {
				if (player[playerIndex1].isLive()) {
					isPlayerLive = true; //하나라도 살아있으면 트루!
				}
			}
			boolean isEnemyLive = false;
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리"); 
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			
			System.out.println("턴을 진행하실려면 엔터를 누르세요");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
//			try {
//				Thread.sleep(1000); // 1초마다 텀주기
//			} catch (InterruptedException e) {
//			}
		}
	}
	}
