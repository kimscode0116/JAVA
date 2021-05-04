
public class EnemyType1 extends Enemy {
	public EnemyType1(String abcde) {
		this.hp = 100;
		this.power = 20;
		this.name = abcde;
	}
	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		player.hp = player.hp - damage;
		
		System.out.println(this.name + "은(는) " + player.name + "에게 " + damage + "의 피해를 입혔다.");
		if(!player.isLive()) {
			System.out.println(this.name + "은(는)" + player.name + "을 파괴했다");
		}
	}
	
	@Override
	public void attack1(Base player3) {
		int damage = this.power - player3.defense;
		player3.hp = player3.hp - damage;
		
		System.out.println(this.name + "은(는) " + player3.name + "에게 " + damage + "의 피해를 입혔다.");
		if(!player3.isLive()) {
			System.out.println(this.name + "은(는)" + player3.name + "을 파괴했다");
		}
	}
	}

