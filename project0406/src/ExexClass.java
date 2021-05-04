import java.util.Arrays;

public class ExexClass {
	public static void main(String[] args) {
//		Student s1 = new Student("홍길동","서울시 마포구","010-0000-0000", 30);
//		Student s2 = new Student("둘리", "부산시 동구","010-1234-5678",100);

		Student[] s = {new Student("홍길동","서울시 마포구","010-0000-0000", 30),
				new Student("둘리", "부산시 동구","010-1234-5678",100)};
		System.out.println(Arrays.toString(s));
	}

}
