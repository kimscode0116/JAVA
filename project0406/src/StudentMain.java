import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {

		StudentData[] arr = { new StudentData("가은혜", 10, 20), new StudentData("나은혜", 20, 30),
				new StudentData("다은혜", 30, 40), new StudentData("라은혜", 40, 50), new StudentData("마은혜", 50, 60),
				new StudentData("바은혜", 70, 80), new StudentData("사은혜", 80, 90), new StudentData("아은혜", 90, 100),
				new StudentData("자은혜", 100, 90), new StudentData("차은혜", 90, 80) };
		
		int totalmidExam = 0;
		int totalFinExam = 0;
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			totalmidExam = totalmidExam + arr[i].midExam;
			totalFinExam = totalFinExam + arr[i].FinExam;
			total = totalmidExam + totalFinExam;
		}
		System.out.println("중간고사 평균 : " + totalmidExam / arr.length);
		System.out.println("기말고사 평균 : " + totalFinExam / arr.length);
		System.out.println("총점의 평균 : " + total / arr.length);
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j].sum < arr[j-1].sum) {
					StudentData temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;							
				}
			}
		}	System.out.println(Arrays.toString(arr));
		
	}
}
