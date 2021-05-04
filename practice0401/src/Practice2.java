
public class Practice2 {
	String name;
	public int korScore = 0;
	public int engScore = 0;
	public int mathScore = 0;
	
	public void printInfo(String name) {
		this.name =name;
	}
	
	public void setKorScore(int Score) {
		this.korScore = Score;
	}
	
	public void setEngScore(int Score) {
		this.engScore = Score;
	}
	
	public void setMathScore(int Score) {
		this.mathScore = Score;
	}
	
	public void printUserInfo( ) {
		System.out.println(this.name + 
				this.korScore + "은? " +);
	}
}
