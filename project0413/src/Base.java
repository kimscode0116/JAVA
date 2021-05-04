
public abstract class Base {
	int hp;  //체력
	int power; //공격력
	int defense; //방어력
	String name;
	String type;
	
	public boolean isLive() {
		if(this.hp < 1) {
			return false;
		}
		return true;
	}
//abstract : BASE를 상속받은 클래스가 요 메소드를 꼭 OVERIDE 해줘야한다! 
	public abstract void action(Base[] player, Base[]enemy); 
	
}
