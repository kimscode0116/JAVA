import java.util.Random;

// 그럼 내가 @Overide 해올게
public class PlayerType1 extends Player {
	public PlayerType1(String name) {
		this.name = name;
		this.hp = 100;
		this.power = 10;
		this.defense = 1;
		this.type = "타입1";
	}
	@Override
	public void action(Base[] player, Base[] enemy) {
		Random r = new Random();
		Base target = null;
		for(int i = 0; i < 99999; i++) {
			int randNumber = r.nextInt(enemy.length);
			if(enemy[randNumber].isLive()) {	//랜덤한 적이 살아있으면, 브레이크 걸기
				target = enemy[randNumber];
				break; //타겟에 아무도 맵핑되지 않는 경우가 생김
			}
		}
		if(target != null) { //타겟에 아무도 맵핑되지 않는 경우 방지
			
			int damage = this.power = target.defense - r.nextInt(5);
			System.out.println(this.name + "이(가)" + target.name + "을(를) 공격해서" + damage + "의 피해를 입혔습니다");
			target.hp = target.hp - damage;
			if(target.hp < 1) {
				System.out.println(target.name + "은(는) 파괴되었다");
			}
		}
	}

}
