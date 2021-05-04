package javaMidTermExam;

public class Votor {
	String name;
	String address;
	int age;
	int ageTotal;

	Votor(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void sumScore() {
		ageTotal += age;
	}

}
