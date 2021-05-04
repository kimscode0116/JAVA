package project0316;

public class Exexclass02 {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		for(int i = 0; i < 100; i++) {
			int number = i + 1;
			
			total = total + number;
			if (number % 2 == 0) {
				evenTotal = evenTotal + number;
			} else {
				oddTotal = oddTotal + number;
			}
		}
		System.out.println("1부터 100까지 합은? " + total);
		System.out.println("1부터 100까지 짝수 합은? " + evenTotal);
		System.out.println("1부터 100까지 홀수 합은? " + oddTotal);

	
	}
}