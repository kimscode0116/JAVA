import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exexclass {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] rank = new int[10];

		Student[] class1 = { new Student("가은혜"), new Student("나은혜"), new Student("다은혜"), new Student("라은혜"),
				new Student("마은혜"), new Student("바은혜"), new Student("사은혜"), new Student("아은혜"), new Student("자은혜"),
				new Student("차은혜") };

		Student[] class2 = { new Student("A"), new Student("B"), new Student("C"), new Student("D"), new Student("E"),
				new Student("F"), new Student("G"), new Student("H"), new Student("I"), new Student("J") };

		Student[] class3 = { new Student("가가"), new Student("나나"), new Student("다다"), new Student("라라"),
				new Student("마마"), new Student("바바"), new Student("사사"), new Student("아아"), new Student("자자"),
				new Student("차차") };
		
		Student[] class4 = {new Student("가나다",50,30)};
		CC[] cc = {new CC("1반",class1),new CC("2반",class2),new CC("3반",class3)};
		
		for(int i =0; i<cc.length; i++) {
			cc[i].initScore();
			cc[i].clacScore();
			cc[i].clacTotal();
			cc[i].sortStudent();
			cc[i].ranksetting();
			cc[i].printData();
		}
	
	
	}
}
