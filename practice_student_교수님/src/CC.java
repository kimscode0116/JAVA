import java.util.Random;

public class CC {
	String name;
	Student[] student;

	CC(String name, Student[] student) {
		this.name = name;
		this.student = student;
	}

	// 데이터 입력부분
	public void initScore() {
		Random r = new Random();
		for (int i = 0; i < student.length; i++) {
			student[i].middleScore = r.nextInt(101);
			student[i].finalScore = r.nextInt(101);
		}
	}

	// 계산부분
	public void clacScore() {
		for (int i = 0; i < student.length; i++) {
			student[i].sumScore();
		}
	}
	// 클래스 총합합산
	int classTotalScore = 0;
	int classTotalMiddleScore = 0;
	int classTotalfinalScore = 0;
	double classAvgTotalScore = 0;

	public void clacTotal() {
		for (int i = 0; i < student.length; i++) {
			classTotalScore = classTotalScore + student[i].sum;
			classTotalMiddleScore = classTotalMiddleScore + student[i].middleScore;
			classTotalfinalScore = classTotalMiddleScore + student[i].finalScore;
		}
		classAvgTotalScore = (double) classTotalScore / student.length;
	}

	//성적순으로 정렬
	public void sortStudent() {
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student.length - 1; j++) {
				if (student[i].sum < student[j].sum) {
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
	}

	// 순위세팅
	public void ranksetting() {
		for (int i = 0; i < student.length; i++) {
			if (i > 1 && student[i - 1].sum == student[i].sum) {
				student[i].rank = student[i - 1].rank;
			} else {
				student[i].rank = i + 1;
			}
		}
	}
	//출력
	public void printData() {
		System.out.println();
		System.out.println(this.name + "의 학생데이터 ");
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i].name + "총점 : " + student[i].sum + "("+student[i].rank + ")");
		}
		System.out.println("반 총점 : " + this.classTotalScore);
		System.out.println("반 평균 : " + this.classAvgTotalScore);
	}

}
