import java.util.ArrayList;
import java.util.Scanner;

public class Customer_byEH {
	public static void main(String[] args) {
		ArrayList<Allcustomer> List = new ArrayList<Allcustomer>();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		System.out.println("★환영합니다!★");

		// 입력부분(고객 정보 입력부분)
		for (int i = 0; i < 999; i++) {
			double evaluation = 0;

			System.out.println("메뉴를 선택하세요");
			System.out.println("1) 방문자 등록");
			System.out.println("2) 방문자 목록");
			System.out.println("3) 별점 평가하기");

			String pressNum = s1.nextLine();
			// 1)방문자 등록
			if (pressNum.equals("1")) {
				System.out.print("이름을 입력하세요 : ");
				String name = s1.nextLine();
				System.out.print("휴대폰 번호를 입력하세요 : ('-'없이 번호만 입력)");
				String number = s1.nextLine();
				System.out.println(" ");

				List.add(new Allcustomer(name, number));
			}
			// 2)방몬자 목록
			else if (pressNum.equals("2")) {
				System.out.println("<현재 방문자 목록>");
				for (int k = 0; k < List.size(); k++) {
					List.get(k).printArea();
				}
			}
			// 3)방문자의 별점 평가
			else if (pressNum.equals("3")) {
				System.out.println("가게를 평가해주세요(최소 1점 / 최대 5점)");
				System.out.println("================================");


				for (int j = 0; j < List.size(); i++) {
					System.out.print("방문자의 이름을 입력하세요 : ");
					String userName = s1.nextLine();

					System.out.print(userName + "님의 평가는 : ");
					evaluation = s2.nextDouble();

					List.get(j).evaluation = evaluation;
					List.add(new Allcustomer(evaluation));
					List.get(j).clac(); // 고객의 평가점수 출력
					List.get(j).customerCalc(); // 총 고객의 평가점수와 평균점수 출력
					break; //break 안걸면 계속 3번의 else if문이 반복되게 된다.
				}
			}
			
			else {
				System.out.println("잘못된 입력입니다."); // String으로 메뉴를 선택해야 하는 이유!!!!
				}
			System.out.println("================================");
		}

	}
}
