package 학생성적_리스트;

import java.util.ArrayList;

public class Exexclass {
	public static void main(String[] args) {
		Student[] s1 = { new Student("홍길동", 500), new Student("둘리", 300), new Student("또치", 200) };
		Student[] s2 = new Student[3];
		s2[0] = new Student("김은혜", 50);
		s2[1] = new Student("님은혜", 30);
		s2[2] = new Student("딤은혜", 20);

		ArrayList<Student> s3 = new ArrayList<Student>();
		s3.add(new Student("최승철",900));
		s3.add(new Student("윤정한",400));
		
		s3.get(1).name = "홍지수";
		s3.get(1).middleScore = 500;
		
		for ( int i = 0; i < s3.size(); i++) {
			System.out.println(s3.get(i).name + "의 중간고사 점수 : " + s3.get(i).middleScore);
		}
		
		System.out.println();

	}
}
