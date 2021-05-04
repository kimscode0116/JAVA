package project0330;

public class Exexclass {
	public static void main(String[] args) {
		//student s1 = new student(); 
		//생성자라고 함 (method인데 생성할때 자동으로 실행하도록 하는애)

		student s1 = new student("홍길동", 100, 100, 100);
		student s2 = new student("둘리", 140, 120, 100);
		
		
//================================================
//		메소드를 사용해서 데이터 넣는 방법
//		s1.setName("홍길동");
//		s1.setKorScore(100);
//		s1.setEngScore(100);
//		s1.setmathScore(100);
//		
//		student s2 = new student();
//		s2.setName("둘리");
//		s2.setKorScore(50);
//		s1.setEngScore(10);
//		s1.setmathScore(90);
//===========================================		
//		property에다가 직접 데이터 넣는 방법 ( no method )
//		s1.name = "홍길동";
//		s1.korScore = 100;
//		s1.engScore = 100;
//		s1.mathScore = 100;
//		
//		student s2 = new student();
//		s2.name = "둘리";
//		s2.korScore = 100;
//		s2.engScore = 10;
//		s2.mathScore = 90;
//		
		s2.printInfo();
		

	}
}
