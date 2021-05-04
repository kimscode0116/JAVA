import java.util.Scanner;

public class Customer {
	String name;
	String phone;

	Customer() { // case2 에서 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		this.name = scanner.nextLine();
		System.out.println("연락처를 입력해주세요");
		this.phone = scanner.nextLine();
	}

	Customer(String name, String phone) { // case1 에서 사용
		this.name = name;
		this.phone = phone;
	}
}
