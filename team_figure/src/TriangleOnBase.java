import java.util.Scanner;

public class TriangleOnBase extends Base {
	double baseLine = 0;
	double height = 0;
	
	TriangleOnBase(String name) {
		super(name);
	}
	
	public void inputData() {
		super.inputData();
		
		Scanner s = new Scanner(System.in);
		System.out.println("밑변을 입력하세요");
		String userText = s.nextLine();
		this.baseLine = Integer.parseInt(userText);
		
		System.out.println("의 높이를 입력하세요");
		String userText2 = s.nextLine();
		this.height = Integer.parseInt(userText2);
	}
	
	public void calcData() {
		
		this.area = this.baseLine * this.height / (double)2;
	}
}
