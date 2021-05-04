import java.util.Scanner;

public class Circle extends Base {
	double baseLine = 0;
	double pi = 3.14;

	Circle(String name) { //생성자 나중에 설명
		super(name); //내가 상속한 곳에 있는 이름을 실행해
//		super.inputData(); //내가 상속한 곳에 있는 메소드를 부를수도 있음
	}
	
	@Override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.name + " 반지름을 입력하세요");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
	}

	public void clacArea() {
		this.areaSize = this.baseLine * this.baseLine * this.pi;
	}
}
