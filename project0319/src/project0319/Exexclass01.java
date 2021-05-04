package project0319;

public class Exexclass01 {
public static void main(String[] args) {
	for (int j  = 0; j < 100; j++) {
		int number = j + 1;
		if (number < 2) {
			continue;
		}
	
		boolean isPrime = true;
		for(int i = 0; i < number; i++) {
			if(i < 2) {
				continue;
			}		
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
			if(isPrime) {
				System.out.println("" + number + "는 소수입니다");
			} else {System.out.println("" + number + "는 소수가 아닙니다"); }
		} 
	}
}