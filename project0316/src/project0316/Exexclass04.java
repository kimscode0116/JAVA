package project0316;

import java.util.Scanner;

public class Exexclass04 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		
		Scanner s1 = new Scanner(System.in);
		int userInputNumber = s1.nextInt();
		
		System.out.println("입력받은 숫자는 " + userInputNumber + "입니다");
		
		boolean isPrime = true;
		for(int i = 0; i < userInputNumber; i++) { //입력받은 숫자까지 반복문이 제대로 출려깅 되는지
			if (i < 2) { // 그 반복 중에서 2보다 작은 숫자들로 continue 시킴 즉 i가 0,1일땐 아래 조건문 안가고 바로 출력함
				continue;
			}
			if (userInputNumber % i == 0) { //한번도 안들어오면 소수이다(=true) 한번이라도 여기 들어오면 소수아님(=false)
				//이 조건은 isPrime = false;를 나타냄
				isPrime = false;	// 나머지가 0이라는건 본인이 ....?아ㅓㄻ;ㅣㅇ나ㅓㄹ;ㅣㅏㅇㄴ멀;ㅣㅏㅇㄴㄹ
			}
		 // 마지막 true문을 괄호 밖에다가 넣지 않으면 계속해서 실행됨 (괄호 위치 잘 생각해야함)
		if (isPrime) {
			System.out.println("소수입니다.");
			} 
		}
	}
}