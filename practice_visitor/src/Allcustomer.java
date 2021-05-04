
public class Allcustomer {
	String name;
	String number;
	double evaluation= 0;
	double Total = 0;
	int cnt = 0;
	
	Allcustomer(String name, String number) {
		this.name = name;
		this.number = number;
	}
	Allcustomer(double evaluation) {
		this.evaluation = evaluation;
	}
	// 고객정보 출력
	public void printArea() {
		System.out.println("이름 : " + this.name + "  전화번호 : " + this.number);
	}
	// 고객의 평가점수 확인, 합계
	public void clac() {
		System.out.println("▶ 이름 : " + this.name + " 평가 점수 : " + this.evaluation);
		this.Total += this.evaluation;
		cnt++;
	}
	// 전체 고객의 평가점수와 평균점수 출력
	public void customerCalc() {
		System.out.println("현재까지 총 평가점수 : " + this.Total + "점 ");
		double avg = (double)this.Total/this.cnt;
		System.out.println("현재까지 평균점수 : " + avg + "점 ");

	}
	
}
