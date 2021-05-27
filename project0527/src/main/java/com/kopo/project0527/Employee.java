package com.kopo.project0527;

public class Employee {
	int idx;
	String name;
	String gender;
	String address;
	String department;
	String created;
	String updated;
	
	Employee() {

	}

	Employee(String empName, String empGender, String empAddress, String empDepartment) {
		this.name = empName;
		this.gender = empGender;
		this.address = empAddress;
		this.department = empDepartment;

	}

	Employee(int idx, String empName, String empGender, String empAddress, String empDepartment) {
		this.idx = idx;
		this.name = empName;
		this.gender = empGender;
		this.address = empAddress;
		this.department = empDepartment;
	}
	
//	public String toTableTagString() {
//		String htmlString = "<tr>" +"<td>"+ this.idx + "</td>"
//				+"<td>"+this.name+"</td>"
//				+"<td>"+this.gender+"</td>"
//				+"<td>"+this.address+"</td>"
//				+"<td>"+this.department+"</td>";
//		return htmlString;
//	}
}
