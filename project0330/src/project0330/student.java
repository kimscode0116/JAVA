package project0330;

public class student {
	public String name;
	public int korScore = 0;
	public int engScore = 0;
	public int mathScore = 0;
	public int totalScore = 0;
	
	student(String name, int korScore, int engScore, int mathScore){
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = korScore + engScore + mathScore;
	}
//	public void setKorScore(int score) {
//		korScore = score;
//	}
//	public void setEngScore(int score) {
//		this.engScore = score;
//	}
//	public void setmathScore(int mathScore) {
//		this.mathScore = mathScore;
//	}
	
	public void printInfo() {
		System.out.println(this.name +  " : " 
					+ "국어" + this.korScore
					+ "국어" + this.engScore
					+ "국어" + this.mathScore
					+ "총점" + this.totalScore
		);
	}
}
