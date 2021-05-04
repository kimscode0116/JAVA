
public class PlayerType1 extends Player {
		int redPortion = 100;
	public PlayerType1 (String ArcherEunhye) {
		this.hp = 90;
		this.power = 20;
		this.defense = 5;
		this.name = ArcherEunhye;	
	}
	
	
	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		System.out.println(this.name + "은(는)" + enemy.name + "에게 "+ damage + "의 피해를 입혔다.");
		
		if(this.hp < 30 && this.hp >= 25) {
			System.out.println(this.name + "은 부활했습니다");
			this.hp = 30;
		}
		
		if(!enemy.isLive()) {
			System.out.println(this.name + "은(는)" + enemy.name + "을 파괴했다");
		}
	}
	@Override
	public void attack1(Base player3) {
		int damage = this.power - player3.defense;
		player3.hp = player3.hp - damage;
		System.out.println(this.name + "은(는)" + player3.name + "에게 "+ damage + "의 피해를 입혔다.");
		
		if(this.hp < 30 && this.hp >= 25) {
			System.out.println(this.name + "은 부활했습니다");
			this.hp = 30;
		}
		
		if(!player3.isLive()) {
			System.out.println(this.name + "은(는)" + player3.name + "을 파괴했다");
		}
	}
	}
