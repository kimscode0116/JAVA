package project0323;

import java.util.Random;

public class Exexclass02 {
	public static int testMethod(int n1,int number2) { //static을 여기에다가 넣어주거나
		int sumNum = n1 + number2;
		System.out.println("" + n1 + "+" + number2 + "=" + sumNum);
		return sumNum;
	}
	
	public static void testMethod2 (int number1, int number2) {
		int resultNum = number1 - number2;
		System.out.println("" + number1 + "-" + number2 + "=" + resultNum);
	}
	
	public static void main(String[] args) { // 여기서 새롭게 인스턴스 만들기
		Random r1 = new Random();
		
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		int result = testMethod(number1, number2);
		testMethod2(number1, number2);
	}
}
