package afternoon;

import java.util.Scanner;

public class People {
	String name;
	String department;
	String position;
	String duty;
	
	Scanner sc = new Scanner(System.in);
	
	People(String part) {
		this.department = part;
	}
	
	People(String userName, String userDepart, String userPosition, String userDuty) {
		this.name = userName;
		this.department = userDepart;
		this.position = userPosition;
		this.duty = userDuty;
	}
	

}
