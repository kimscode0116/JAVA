package practice_companyPeople;

import java.util.ArrayList;

public class Part {
	String partName;
	ArrayList<People>member;
	
	Part(String department) {
		this.partName = department;
		member = new ArrayList<People>();
	}
	
}
