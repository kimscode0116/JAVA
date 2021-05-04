package afternoon;

import java.util.ArrayList;

public class departmentAccess {
	String deparmentName;
	int Acount = 0;
	int Bcount = 0;
	int Ccount = 0;
	int AAAcount = 0;
	int BBBcount = 0;
	int CCCcount = 0;
//카운트
	
	ArrayList<People>member;
	
	departmentAccess(String name){
		this.deparmentName = name;
		member = new ArrayList<People>();
	}
}
