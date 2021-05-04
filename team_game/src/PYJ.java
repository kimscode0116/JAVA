
public class PYJ extends Player{
	
	PYJ(String name){
		this.hp = 100;
		this.power = 20;
		this.defense = 10;
		this.name = name;
	}

	@Override
	public void attack(Base enemy) {
		int damage = this.power * 2 - enemy.defense;
		enemy.hp = enemy.hp - damage;		
		System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 피해를 입혔다.");

	}
}
