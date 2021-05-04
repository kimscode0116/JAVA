//클래스(설계도)
public class Student  { //hash,toString의 메소드가 원래 있는채로 extends생략되어있음
	String name; //프로퍼티
	String address;
	String phone;
	int age;
	
	//생성자
	Student(String name, String address, String phone, int age) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	}
	//메소드(public)
	public void printInfo( ) {
		System.out.println("이름 :" + this.name +", 주소 :" +
					this.address + ", 연락처 : " + this.phone +
					", 나이 : " + this.age);
	}
	//메소드(private)
	private void print( ) {
		System.out.println("이름 :" + this.name +", 주소 :" +
					this.address + ", 연락처 : " + this.phone +
					", 나이 : " + this.age);
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return this.name;
	}
	//toString(원래는 주소값 알려주던애)가 있었는데 내입맛대로 수정했어!
//	@Override
//	public String toString() {
//		return "이름 :" + this.name +", 주소 :" +
//				this.address + ", 연락처 : " + this.phone +
//				", 나이 : " + this.age;
//	}

}