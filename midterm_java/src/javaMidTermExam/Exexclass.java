package javaMidTermExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exexclass {
	public static void main(String[] args) {
		ArrayList<Votor> votor = new ArrayList<Votor>();
		ArrayList<Politics> politics = new ArrayList<Politics>();
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		for (int i = 0; i < 9999; i++) {
			System.out.println("<<<<<<유권자 선호 정당에 대한 조사>>>>>>");
			System.out.println("1) 유권자 기본정보 입력");
			System.out.println("2) 유권자 전체목록 보기");
			System.out.println("3) 선호 정당 입력하기");
			System.out.println("4) 선호 정당에 대한 총계");

			String pressNum = s.nextLine();
			// step1-1)입력부분
			if (pressNum.equals("1")) {
				System.out.print("▶ 이름을 입력하세요 : ");
				String name = s.nextLine();
				System.out.print("▶ 주소를 입력하세요 : ");
				String address = s.nextLine();
				System.out.print("▶ 나이를 입력하세요 : ");
				int age = s2.nextInt();

				votor.add(new Votor(name, address, age));
			}
			// step1-2)입력부분
			else if (pressNum.equals("2")) {
				System.out.println("<유권자 목록>");
				for (int j = 0; j < votor.size(); j++) {
					System.out.println(
							"(" + votor.get(j).name + ", " + votor.get(j).age + ", " + votor.get(j).address + ")");
				}
				// step 2) 입력된 정보의 기본통계 계산부분
				System.out.println("유권자 정보에 대한 통계를 보시려면 0번, 초기메뉴로 돌아가시려면 1번을 눌러주세요");
				System.out.print("입력 : ");
				String userInputNum = s.nextLine();
				if (userInputNum.equals("0")) {
					System.out.println("[유권자 정보 통계]");
					int userAgeTotal = 0;
					int age10 = 0;
					int age20 = 0;
					int age30 = 0;
					int age40 = 0;
					int age50 = 0;
					int age60 = 0;

					for (int k = 0; k < votor.size(); k++) {
						userAgeTotal += votor.get(k).age;
						int userAge = votor.get(k).age;
						if (userAge >= 0 && userAge < 20) {
							age10++; // 10대
						} else if (userAge >= 20 && userAge < 30) {
							age20++; // 20대
						} else if (userAge >= 30 && userAge < 40) {
							age30++; // 30대
						} else if (userAge >= 40 && userAge < 50) {
							age40++; // 40대
						} else if (userAge >= 50 && userAge < 60) {
							age50++; // 50대
						} else
							age60++; // 60대
					}
					double aveAge = ((double) userAgeTotal / votor.size());

					// step 2) 입력된 정보통계 출력부분
					System.out.println(" ▶유권자의 수(명) : " + votor.size());
					System.out.println(" ▶유권자의 평균나이 : " + aveAge);
					System.out.println(" ▶연령대별 유권자의 수 : 10대 (" + age10 + ") " + "20대 (" + age20 + ") " + "30대 (" + age30
							+ ") " + "40대 (" + age40 + ") " + "50대 (" + age50 + ") " + "60대 ( " + age60 + ") ");
					continue;
				} else if (userInputNum.equals("1")) {
					continue;
				}
			}
			// step 3) 각 유권자별 선호 정당 입력부분
			else if (pressNum.equals("3")) {
				System.out.println("유권자 등록하셨던 이름을 입력하세요");
				String votorName = s.nextLine();
				System.out.println("유권자 등록하셨던 주소를 입력하세요");
				String votorAdd = s.nextLine();
				System.out.println("유권자 등록하셨던 나이를 입력하세요");
				String inputAge = s.nextLine();
				int votorAge = Integer.parseInt(inputAge);

				for(int j = 0; j < votor.size(); j++) {
				if (!votorName.equals(votor.get(j).name)) {
					System.out.println("※※※입력된 유권자가 아닙니다※※※");
				} else {
					System.out.println("선호하시는 정당을 입력하세요 ([Z정당] 의 형태로 입력)");
					System.out.println(" A정당 -- B정당 -- C정당");
					String userInputPolitic = s.nextLine();
					if (!userInputPolitic.equals("A정당")||!userInputPolitic.equals("B정당")||!userInputPolitic.equals("C정당") ) {
						System.out.println("정당은 한 곳만 선택 가능합니다");
					}
					else try {
						politics.add(new Politics(votorName, votorAdd, votorAge, userInputPolitic));
					} catch (Exception e) {
					}
				}
			}
			}
			// step 4) 선호 정당에 대한 통계부분

			else if (pressNum.equals("4")) {
				System.out.println("선호 정당에 대한 통계는 다음과 같습니다.");
				System.out.println("●조사에 참여한 유권자수 (" + votor.size() + ")");
				System.out.println("●선호 정당을 투표한 유권자수 (" + politics.size() + ")");
				System.out.println("●●●전체 유권자 대비 선호 정당 투표자 비율" + ((double) politics.size() / votor.size()) * 100 + "%");

				int cntA = 0;
				int cntB = 0;
				int cntC = 0;
				for (int j = 0; j < politics.size(); j++) {
					if (politics.get(j).userInputPolitic.equals("A정당")) {
						cntA++;
					} else if (politics.get(j).userInputPolitic.equals("B정당")) {
						cntB++;
					} else if (politics.get(j).userInputPolitic.equals("C정당")) {
						cntC++;
					}
				}
				System.out.println("●정당 별 선호자 수 및 비율");
				System.out.println("A정당 : " + ((double) politics.size() / cntA) * 100 + "%");
				System.out.println("B정당 : " + ((double) cntB / politics.size()) * 100 + "%");
				System.out.println("B정당 : " + ((double) cntC / politics.size()) * 100 + "%");
			}

			System.out.println("==============================================");

		}
	}
}
