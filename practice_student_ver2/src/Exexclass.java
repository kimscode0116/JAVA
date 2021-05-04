import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exexclass {
	public static void main(String[] args) {

		Student[] class1 = { new Student("가은혜"), new Student("나은혜"), new Student("다은혜"), new Student("라은혜"),
				new Student("마은혜"), new Student("바은혜"), new Student("사은혜"), new Student("아은혜"), new Student("자은혜"),
				new Student("차은혜") };
		Student[] class2 = { new Student("A"), new Student("B"), new Student("C"), new Student("D"), new Student("E"),
				new Student("F"), new Student("G"), new Student("H"), new Student("I"), new Student("J") };
		Student[] class3 = { new Student("가가"), new Student("나나"), new Student("다다"), new Student("라라"),
				new Student("마마"), new Student("바바"), new Student("사사"), new Student("아아"), new Student("자자"),
				new Student("차차") };

		AllClass[] allclass = {new AllClass("dd",class1),new AllClass("dd",class2),new AllClass("dd",class3)};


	}
}
