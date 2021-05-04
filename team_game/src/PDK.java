import java.util.Random;

public class PDK extends Player {
	public PDK(String name) {
		this.hp = 150;
		this.power = 15;
		this.defense = 8;
		this.name = name;

	}

	public void attack(Base enemy) {
		Random rd = new Random();
		int dice = rd.nextInt(6);
		if(dice >= 4) {
			int damage = this.power * 2;
			System.out.println(this.name + "은(는)" + enemy.name + "에게" + damage + "의 피해를 입혔다.");
			System.out.println("▶▶▶▶" + this.name + "가 " + enemy.name + " 에게 33%의 확률로 치명타를 입혔다!");
		}
		
		else {int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		System.out.println(this.name + "은(는)" + enemy.name + "에게" + damage + "의 피해를 입혔다.");
		}
		
		if (!enemy.isLive()) {
			System.out.println(this.name + "은(는)" + enemy.name + "을(를) 파괴했다.");
		}
		}

		}
