package javaPractice;

import java.util.Scanner;

public class People {
	String name;
	String address;
	int age;
	String party = "";

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name = sc.nextLine();
		System.out.print("주소 : ");
		this.address = sc.nextLine();
		System.out.print("나이 : ");
		String userInputAge = sc.nextLine();
		try {
			this.age = Integer.parseInt(userInputAge);
		} catch (Exception e) {
		}
	}

	public String toString() {
		String print = "[ "+this.name + " , "+ this.address + " , " + this.age + "]"
				;
		return print;
	}
}
