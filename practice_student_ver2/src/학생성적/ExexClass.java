package 학생성적;

import java.util.Random;

public class ExexClass {
	public static void main(String[] args) {
		Random r = new Random();

		Student[] class1 = { new Student("김은혜"), new Student("고수진"), new Student("이혜진") };

		for (int i = 0; i < class1.length; i++) {
			class1[i].midScore = r.nextInt(101);
			class1[i].finScore = r.nextInt(101);

			class1[i].clac();
			System.out.println(class1[i].midScore + "기말고사 " + class1[i].finScore + "평균" + class1[i].avg);

		}

		int midTotal = 0;
		int finTotal = 0;
		int allTotal = 0;
		double allAvg = 0;

		for (int i = 0; i < class1.length; i++) {
			midTotal += class1[i].midScore;
			finTotal += class1[i].finScore;
			allTotal = midTotal + finTotal;
			allAvg = (double) allTotal / class1.length;

		}
		System.out.println(midTotal);
		System.out.println(finTotal);
		System.out.println(allTotal);
		System.out.println(allAvg);

		for (int i = 0; i < class1.length-1; i++) {
			if (class1[i].avg > class1[i+1].avg) {
				class1[i+1].rank++;
			}
			System.out.println(class1[i].name + "은" + class1[i].rank + "등");
		}

	}

}
