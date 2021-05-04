import java.util.Random;
// 랜덤한 수로 학점 보여주기
public class practice0312 {
	public static void main(String[] args) {
		Random G1 = new Random();
		int grade = G1.nextInt(101);
		System.out.println("당신의 점수는 ? " + "\n" + grade);
		
		System.out.println("당신의 학점은 ? " );
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >=80) {
			System.out.println("B");
		} else if (grade >=70) {
			System.out.println("C");
		} else if (grade >=60) {
			System.out.println("D");
		} else if (grade <60) {
			System.out.println("E");
		}
	}
}
