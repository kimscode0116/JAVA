
public class Student {
	int midScore = 0;
	int finScore = 0;
	int total = 0;
	
	String name;
	
	Student(String name,int mid, int fin){
		this.name = name;
		this.midScore = mid;
		this.finScore = fin;
		
		this.total = mid + fin;
	}
	@Override
	public String toString() {
		return this.name + this.midScore;
		}
}
