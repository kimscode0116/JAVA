package project0504;

import com.kopo.TestClass;

public class ScannerPractice {
	public static void main(String[] args) throws Exception {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

//	java.util.Date d1 = new java.util.Date();
//	java.sql.Date d2 = new java.sql.Date();

		TestClass t1 = new TestClass();

		int a = 10;
		double b = 20;

		Integer c = 20;
		Double d = 10.0;
		Double d1 = new Double(20.0);
		
		//4자리 맞춰서 숫자를 출력하고 싶음
//		for(int i = 0; i < 101; i++) {
//			System.out.println(i);
//			String temp = String.format("%4d", i);
//			String temp = String.format("%04d", i);
//			System.out.println(temp);
//		}
		
//		try {
//			int a1 = 10 / 0;
//			int b1 = Integer.parseInt("10a");
//		} catch (ArithmeticException e) {
//			System.out.println(11);
//		} catch (NumberFormatException e) {
//			System.out.println(22);
//		} catch (Exception e) {
//			System.out.println(33);
//			e.printStackTrace();
//		}
		
		t1.doAction(0);
	}
}
