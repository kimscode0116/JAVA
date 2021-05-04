package project0330;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			Exexclasss[] Exexclasss = new Exexclasss[5];
			for(int i = 0; i < 5; i++) {
			System.out.println("학생의 이름을 입력하세요");
			String name = scanner.nextLine();
			
			System.out.println("국어 성적을 입력하세요");
//			int korScore = scanner.nextInt();
			//문자 입력 받아서 변환하는 방법
			String inputStirng = scanner.nextLine();
			int korScore = Integer.parseInt(inputStirng);
	
			System.out.println("영어 성적을 입력하세요");
			int engScore = scanner.nextInt();
	
			System.out.println("수학 성적을 입력하세요");
			int mathScore = scanner.nextInt();
			
			Exexclasss[i] = new Exexclasss(name, korScore, engScore, mathScore);
			
			}
			
			int totalkorScore = 0;
			int totalengScore = 0;
			int totalmathScore = 0;
			
			for(int i = 0; i < 5; i++) {
				totalkorScore = totalkorScore + Exexclasss[i].korScore;
				totalengScore = totalengScore + Exexclasss[i].engScore;
				totalmathScore = totalmathScore + Exexclasss[i].mathScore;
			}
		}
	}

