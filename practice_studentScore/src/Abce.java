import java.util.Arrays;
import java.util.Scanner;

public class Abce {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		System.out.print("총 학생 수는? ");
		int stuNum = s.nextInt();

		Student[] arr = new Student[stuNum];
		
		for (int i = 0; i < stuNum; i++) {
			System.out.println("학생의 이름을 입력하세요 : ");
			String name = s1.nextLine();
			System.out.println("중간고사 성적을 입력하세요 : ");
			int midScore = s.nextInt();
			System.out.println("기말고사 성적을 입력하세요 : ");
			int finScore = s.nextInt();
			arr[i] = new Student(name, midScore, finScore);				
		}

		int midTotal = 0;
		int finTotal = 0;
		int totalTotal = 0;

		for (int i = 0; i < arr.length; i++) {
			midTotal = midTotal + arr[i].midScore;
			finTotal = finTotal + arr[i].finScore;
			totalTotal = midTotal + finTotal;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].total < arr[i].total) {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
