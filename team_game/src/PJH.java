public class PJH extends Player {
	public PJH(String name) {
		this.hp = 150;
		this.power = 15;
		this.name = name;
		this.defense = 8;
	}
	
	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
		this.hp = hp + damage;
		// enemy의 hp에 damage를 가산하여 흡혈 메커니즘 구현
		System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 피해를 입혔다.");
		System.out.println(this.name + "은(는) " + enemy.name + "을(를) 흡혈하여 " + this.hp + "로 회복하였다.");


		if (!enemy.isLive()) {
			System.out.println(this.name + "은(는) " + enemy.name + "을(를) 파괴했다.");
		}
	}

}
