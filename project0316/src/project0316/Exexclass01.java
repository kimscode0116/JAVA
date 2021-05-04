package project0316;

public class Exexclass01 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int number1 = i + 1;
			
			if (number1 % 2 == 1) {
				continue;
			}
			if (number1 == 6) {
				break;
			}
			
			System.out.println(number1 + "은 짝수입니다.");
			}
		}
	}