import java.util.Scanner;

public class Exexclass0421 {
	public static void main(String[] args) {
		int Total = 0;
		int cnt = 0;
		for (int inf = 0; inf < 9999; inf++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("★환영합니다!★");
			System.out.println("방문자 총 인원수는?");
			String howMany = sc.nextLine();
			int number = Integer.parseInt(howMany);
			Customer0421[] customer = new Customer0421[number];

			for (int num = 0; num < 30; num++) {
				System.out.println("1) 방문자 등록하기");
				System.out.println("2) 방문자 목록보기");
				System.out.println("3) 가게 평가하기");
				System.out.println("4) 현재까지 가게 평점보기");
				String pressNum = sc.nextLine();

				if (pressNum.equals("1")) {
					for (int i = 0; i < customer.length; i++) {
						System.out.println("▶ 방문자의 이름 : ");
						String username = sc.nextLine();
						System.out.println("▶ 방문자의 전화번호 : ");
						String userNumber = sc.nextLine();

						customer[i] = new Customer0421(username, userNumber);
						System.out.println("입력완료");
						continue;
					}
				} else if (pressNum.equals("2")) {
					System.out.println("[방문자 목록]");
					for (int i = 0; i < customer.length; i++) {
						System.out.println(customer[i].name + " : " + customer[i].phoneNumber);

					}
					continue;
				}

				else if (pressNum.equals("3")) {
					System.out.println("당신의 이름을 입력하세요");
					String name = sc.nextLine();
					for (int i = 0; i < customer.length;) {
						if (name.equals(customer[i].name)) {
							System.out.println("평가를 입력하세요 1~5");
							int evaluation = sc.nextInt();
							Total += evaluation;
							cnt++;
							System.out.println("평가가 완료되었습니다. 감사합니다 :>");
						}
					break;
					}
					
				}
				else if (pressNum.equals("4")) {
					System.out.println("현재까지 고객의 평점은?");
					int avg = Total/cnt;
					System.out.println(avg);
				}
			}
		}
	}
}
