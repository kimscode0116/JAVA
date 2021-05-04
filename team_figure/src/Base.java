
public class Base {
	int calc = 0;
	double area = 0;
	String name;

	Base(String name) {
		this.name = name;
	}
	
	public void inputData() {
		System.out.println();
		System.out.println("----- " + this.name + " -----");
	}
	
	public void calcData() {
	}
	
	public void printSize() {
		this.calcData();
		System.out.println(name + "의 크기는" + this.area);
	}
}
