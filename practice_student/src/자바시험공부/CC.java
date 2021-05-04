package 자바시험공부;

import java.util.Random;

public class CC {
	Base[] base;;
	String name;

	CC(String name, Base[] student) {
		this.name = name;
		this.base = student;
	}



	// 입력부분
	public void inputData() {
		Random r = new Random();
		for (int i = 0; i < base.length; i++) {
			base[i].midScore = r.nextInt(101);
			base[i].finScore = r.nextInt(101);
			base[i].clac();
		}
	}
	
	int classmidTotal = 0;
	int classfinTotal = 0;
	int classTotal = 0;
	double classAvg = 0;
	int classrank = 0;
	// 계산부분
	public void dataClac() {
		for (int i = 0; i < base.length; i++) {
			classmidTotal += base[i].midScore;
			classfinTotal += base[i].finScore;
			classTotal += base[i].total;
			classAvg = (double) (classTotal / base.length) / 2;
		}
	}

	// 순서대로 정렬하기(버블소트)
	public void sort() {
		for (int i = 0; i < base.length - 1; i++) {
			for (int j = 1; j < base.length; j++) {
				if (base[i].total < base[j].total) {
					Base temp = base[i];
					base[i] = base[j];
					base[j] = temp;
				}
			}
		}
	}

	// 개인별 순위
	// 지금 내림차순으로 젤 앞에 있는애가 젤 큼!
	public void sortRank() {
		for (int i = 0; i < base.length; i++) {
			if (i > 1 && base[i].avg == base[i - 1].avg) {
				base[i].rank = base[i - 1].rank;
			} else
				base[i].rank = i + 1;
		}
	}

	// 데이터 출력
	public void printData() {
		System.out.println();
		System.out.println(this.name + "의 학생데이터");
		for (int i = 0; i < base.length; i++) {
			System.out.print("이름 : " + base[i].name + " 중간시험 : " + base[i].midScore + " 기말시험 : " + base[i].finScore);
			System.out.println(" - 평균 : " + base[i].avg + " 등수 : " + base[i].rank);
		}
		System.out.println("반 총점 : " + this.classTotal); // 반 전체 점수
		System.out.println("반 평균 : " + this.classAvg);

	}

}
