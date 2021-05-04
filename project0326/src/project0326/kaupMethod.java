package project0326;

import java.util.Scanner;

public class kaupMethod {
	
	public static double inputData () {
		Scanner s = new Scanner(System.in);
		
		System.out.print("체중을 입력하세요(kg) : ");
		String weight = s.nextLine();
		double weightData = Double.parseDouble(weight); // 텍스트로 받아서 숫자로 변환
		return weightData;
	}
	public static double inputData2() {
		Scanner s = new Scanner(System.in);

		System.out.print("신장을 입력하세요(m) : ");
		String height = s.nextLine();
		double heightData = Double.parseDouble(height);
		return heightData;
	}
	
	public static void outputData (double weightdata, double heightData) {
		double kaupValue = (double)weightdata / (heightData*heightData); 
		System.out.println("당신의 카우프 지수는? " + kaupValue );
		
		if(kaupValue>=30) {
			System.out.println("비만입니다");
		}
		else if(kaupValue >= 24) {
			System.out.println("과체중입니다");
		}
		else if(kaupValue >= 20) {
			System.out.println("정상입니다");
		}
		else if(kaupValue < 20) {
			System.out.println("저체중입니다");
		}
		else if(kaupValue < 15) {
			System.out.println("여윔입니다");
		}
		else if(kaupValue < 13) {
			System.out.println("영양 실조증입니다");
		}
		else if(kaupValue <= 10) {
			System.out.println("소모증입니다");
		}
	}
}
