// 공통으로 처리 가능한걸 여기다가 모아놓고, 추가적으로 필요한건 다시 클래스 만듣는 방식
public abstract class Base {
	double areaSize = 0;
	String name;
	
	Base(String name) {
		this.name = name;
	}
	
	public void inputData() {
		// 현재는 내용이 없어서 삭제해도 무방함
	} 
	
	public abstract void clacArea();
	
	public void printSize() {
		
		this.clacArea();
		System.out.println(this.name + "의 크기는" + this.areaSize);
	}
}
//하나의 상속으로 관리할 수 있는게 있어서 상속을 배워야함
//지금은 내용이 없지만 