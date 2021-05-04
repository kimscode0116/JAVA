import java.util.Arrays;
import java.util.Random;

public class AllClass {
	String name;
	Student[] student;
	int[] rank = new int[10];

	AllClass(String name, Student[] student) {
		this.name = name;
		this.student = student;
	}

	// 데이터 넣는 반복문
	Random r = new Random();

	public void inputData() {
		for (int i = 0; i < student.length; i++) {
			student[i].middleScore = r.nextInt(101);
			student[i].finalScore = r.nextInt(101);
			student[i].clacScore();
		}
	}

	// 클래스의 총합 평균 구하기
	int classTotal = 0;
	int classAvg = 0;
	int classMidTotal = 0;
	int classfinTotal = 0;

	public void clac() {
		for (int i = 0; i < student.length; i++) {
			classMidTotal = classMidTotal + student[i].middleScore;
			classfinTotal = classfinTotal + student[i].finalScore;
			classTotal = classMidTotal + classfinTotal;
			classAvg = classTotal / (student.length * 2);
		}
	}

	// 정렬 후 등수 출력
	public void sort() {
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - 1; j++) {
				if (student[j].avg < student[j + 1].avg) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
			}
		}
	}

	// 각자의 등수 넣어주기
	public void rank() {
	for (int i = 0; i < student.length; i++) {
		rank[i] = 1;
		for (int j = 0; j < student.length; j++) {
			if (student[i].avg < student[j].avg) {
				rank[i]++;
			}
		}
		System.out.print((i+1)+"등 : "+student[i].name +" ");
	}
	}
	
	public void printData() {
		System.out.println(Arrays.toString(student)+"\n");
		System.out.println("전체평균 : " + classAvg + "  전체 합계 : " + classTotal);
	}
	}

