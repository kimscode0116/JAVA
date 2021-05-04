
public class Customer0421 {
	String name;
	String phoneNumber;
	int evaluation = 0;
	int cnt=0;
	
	Customer0421(String username, String userNumber) {
		this.name = username;
		this.phoneNumber = userNumber;
		
	}
	Customer0421(int userInputNumber) {
		this.evaluation = userInputNumber;
		cnt++;
	}
	
	public void clac() {
		int avg = 0;
		avg = evaluation/cnt;
	}
	

}


