import java.util.Arrays;

public class StudentTeacher2 {
	public static void main(String[] args) {

		StudentTeacher[] StudentTeacher = {new StudentTeacher("가은혜",10,20),
				new StudentTeacher("나은혜", 20,30),
				new StudentTeacher("다은혜", 30,40),
				new StudentTeacher("라은혜", 40,50),
				new StudentTeacher("마은혜", 50,60),
				new StudentTeacher("바은혜", 70,80),
				new StudentTeacher("사은혜", 80,90),
				new StudentTeacher("아은혜", 90,100),
				new StudentTeacher("자은혜", 100,90),
				 new StudentTeacher("차은혜", 90,80)};
		
		int totalMiddleScore = 0;
		int totalFinalScore = 0;
		int totatlScore = 0;
		for(int i = 0; i < StudentTeacher.length; i++) {
			totalMiddleScore = totalMiddleScore + StudentTeacher[i].midExam;
			totalFinalScore = totalFinalScore + StudentTeacher[i].FinExam;
		}
		
		System.out.println(Arrays.toString(StudentTeacher));
	
		}
	}

