
public class PEH extends Player {
	public PEH (String name) {
		this.hp = 90;
		this.power = 12;
		this.defense = 5;
		this.name = name;	
	}
	
	@Override
	public void attack(Base enemy) {

		
		if(this.hp < 30) {
		System.out.println(this.name + "은 위기에 처해, ▶궁◀을 사용했다!" );
		System.out.println("▶▶▶▶▶궁 : 상대에게 공격을 2번한다◀◀◀◀◀");
		int damageDamage = this.power - enemy.defense;
		int damageDamage2 = this.power - enemy.defense;
		enemy.hp = enemy.hp - damageDamage;
		enemy.hp = enemy.hp - damageDamage2;
		System.out.println(this.name + "은(는)" + enemy.name + "에게 "+ damageDamage + "의 피해를 입혔다.");
		System.out.println(this.name + "은(는)" + enemy.name + "에게 "+ damageDamage2 + "의 피해를 입혔다.");
		
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		System.out.println(this.name + "은(는)" + enemy.name + "에게 "+ damage + "의 피해를 입혔다.");
		}
	
		if(!enemy.isLive()) {
			System.out.println(this.name + "은(는)" + enemy.name + "을 파괴했다");
		}
	}
	}
