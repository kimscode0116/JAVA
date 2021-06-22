import java.util.Arrays;
import java.util.Scanner;

public class Final_exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstInputArr = sc.nextLine();
		String secondInputArr = sc.nextLine();
		
		String[] firstArr = firstInputArr.split(" ");
		String[] secondArr = secondInputArr.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < firstArr.length; i++) {
			for(int j = 0; j < secondArr.length; j++) {
				if(firstArr[i].equals(secondArr[j])) {
					cnt++;
					secondArr[j] = "null"; //임의 값으로 바꾸기
					break;
				} else if (firstArr[i] != secondArr[j]) {
					continue;
				}
			}
		}
		if(cnt == secondArr.length) {
			System.out.println("T");
		} else System.out.println("F");
	}
}
