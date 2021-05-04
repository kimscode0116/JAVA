package 자바시험공부;

public class Base {
	String name;
	int midScore;
	int finScore;
	int total;
	double avg;
	int rank = 0;

	Base(String name) {
		this.name = name;
	}
	//학생 평균구하는 메소드
	public void clac() {
		total = midScore+finScore;
		avg = total/(double)2;
	}
	
	@Override
	public String toString() {
		return "이름 : "+this.name + " 중간시험 : " + this.midScore + " 기말시험 : " + this.finScore +"\n" ;
	}
}
