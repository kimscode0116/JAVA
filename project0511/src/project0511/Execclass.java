package project0511;

import java.util.ArrayList;
import java.util.Collections;

public class Execclass {
	public static void main(String[] args) {

		ArrayList<Student>student = new ArrayList<Student>();
		
		student.add(new Student("가은혜",30));
		student.add(new Student("나은혜",40));
		student.add(new Student("다은혜",20));
		student.add(new Student("라은혜",10));
		student.add(new Student("마은혜",50));
		student.add(new Student("바은혜",62));
		student.add(new Student("사은혜",50));
		student.add(new Student("아은혜",70));
		student.add(new Student("자은혜",90));
		student.add(new Student("카은혜",33));

		Collections.sort(student);
		
		for(int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).name + ": " +
								student.get(i).score + "\n");
		}
	}
}
