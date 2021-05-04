import java.util.Scanner;
	
public class Triangle extends Base {
	double baseLine = 0;
	double height = 0;
	
	Triangle(String name) { //생성자 나중에 설명
		super(name);
	}
	
	@Override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.name + " 밑변을 입력하세요");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		
		System.out.println(this.name + " 높이를 입력하세요");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}
	
	public void clacArea() {
		this.areaSize = this.baseLine * this.height / (double)2;	
		}
}
