
public class StudentData {
	String name;
	int midExam;
	int FinExam;

	int sum;

	StudentData(String name, int midExam, int FinExam) {
		this.name = name;
		this.midExam = midExam;
		this.FinExam = FinExam;

		this.sum = midExam + FinExam;
	}
	
	@Override
	public String toString() {
		return "학생 이름 : " + this.name +  "총점 : " + this.sum + "\n";
	}
}
//this.name + " 중간고사 점수 : " + this.midExam + " 기말고사 점수 : " + this.FinExam + " 시험 총점 : "+ this.sum + "