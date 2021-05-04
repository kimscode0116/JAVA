import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1("김은혜"),new PlayerType1("나은혜"),new PlayerType2("힐러"),new PlayerType1("다은혜")}; // 
		Player[] enemy = {new PlayerType1("송민섭"),new PlayerType1("여진경"),new PlayerType1("김지원"),new PlayerType1("강서구")}; //, 
		
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("" + (i + 1) + "턴\n\n");
			// player 턴
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive()) {
					player[playerIndex].action(player, enemy);
				}

			}
			// enemy 턴
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget1 = r.nextInt(enemy.length);
				if (enemy[enemyIndex].isLive() ) {
					enemy[enemyIndex].action(enemy,player);
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
			scanner.nextLine();
//			try {
//				Thread.sleep(1000); // 1초마다 텀주기
//			} catch (InterruptedException e) {
//			}
		}
	}
	}
