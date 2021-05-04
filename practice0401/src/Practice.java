import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int userNum = s1.nextInt();
		
//		for(int i = 1; i <= userNum; i++) {
//			if(userNum%2 == 0) {
//				System.out.println("소수가 아닙니다");
//				break;
//			}
//			else if(userNum%3 == 0) {
//				System.out.println("소수가 아닙니다");
//				break;
//			}
//			else if(userNum%i == 0) {
//				System.out.println("소수입니다");
//				break;
//			}
//		}
		boolean isPrime = true;
		for(int i = 0; i < userNum; i++) {
			if(i<2) {
				continue;
			}
			else if(userNum%i == 0) {
				isPrime = false;
			}	
		}System.out.println("소수입니다");	
		
	}
}
