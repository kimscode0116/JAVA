package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<People> people = new ArrayList<People>();
		while (true) {
			System.out.println("유권자 정보입력 프로그램입니다.");
			System.out.println("메뉴를 선택하세요 ");
			System.out.println("1 : 유권자 정보입력");
			System.out.println("2 : 유권자 전체정보 출력");
			System.out.println("3 : 유권자 기본통계 출력");
			System.out.println("4 : 유권자 선호정당 입력");
			System.out.println("5 : 유권자 선호정당 통계");
			System.out.println("quit : 입력 정지");

			String number = sc.nextLine();
			if (number.equals("1")) {
				People a1 = new People();
				a1.inputData();
				people.add(a1);
			} else if (number.equals("2")) {
				for (int j = 0; j < people.size(); j++) {
					System.out.println(people.get(j));
				}
			} else if (number.equals("3")) {
				int total = 0;
				int total20 = 0;
				int total30 = 0;
				int total40 = 0;
				int total50 = 0;
				int total60 = 0;

				for (int j = 0; j < people.size(); j++) {
					total += people.get(j).age;

					if (people.get(j).age >= 20 && people.get(j).age < 30) {
						total20++;
					} else if (people.get(j).age >= 30 && people.get(j).age < 40) {
						total30++;
					} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
						total40++;
					} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
						total50++;
					} else if (people.get(j).age >= 60) {
						total60++;
					}
				}

				System.out.println("전체 유권자 수 : " + people.size());
				System.out.println("유권자의 평균 나이 : " + (double) total / people.size());
				System.out.print("연령대별 유권자의 수 : ");
				System.out.println("20대 ( " + total20 + " )" + "30대 ( " + total30 + " )" + "40대 ( " + total40 + " )"
						+ "50대 ( " + total50 + " )" + "60대 ( " + total60 + " )");
			} else if (number.equals("4")) {
				System.out.println("선호 정당을 입력할 사람의 이름을 입력하세요");
				String inputName = sc.nextLine();
				System.out.println("선호 정당을 입력할 사람의 나이를 입력하세요");
				String inputAgeString = sc.nextLine();
				int inputAge = Integer.parseInt(inputAgeString);

				int checkNumber = -1;
				for (int j = 0; j < people.size(); j++) {
					if (inputName.equals(people.get(j).name) && inputAge == people.get(j).age) {
						checkNumber = j;
						break;
					}
				}
				if (checkNumber < 0) {
					System.out.println("입력하신 정보에 해당하는 사람이 없습니다.");
				} else {
					People selected = people.get(checkNumber);
					System.out.println("선호 정당을 입력하세요. A B C 중 입력");
					selected.party = sc.nextLine();
				}
			} else if (number.equals("5")) {
				int inputCheckParty = 0;
				for (int j = 0; j < people.size(); j++) {
					if (!people.get(j).party.equals("")) {
						inputCheckParty++;
					}
				}
				double percentFavoriteParty = inputCheckParty / (double) people.size() * 100;
				System.out.println("전체 유권자 수" + people.size());
				System.out.println("선호 정당을 입력한 사람의 수 : " + inputCheckParty);
				System.out.println("전체 유권자 대비 선호 정당을 입력한 사람의 비율 : " + percentFavoriteParty);

				Party aparty = new Party("A");
				Party bparty = new Party("B");
				Party cparty = new Party("C");

				for (int j = 0; j < people.size(); j++) {
					if (people.get(j).party.equals("A")) {
						aparty.FavoritePeopleCount++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							aparty.Favorite20Count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) {
							aparty.Favorite30Count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							aparty.Favorite40Count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							aparty.Favorite50Count++;
						} else if (people.get(j).age >= 60) {
							aparty.Favorite60Count++;
						}
						if (people.get(j).address.contains("서울")) {
							aparty.seoulCount++;
						}
						if (people.get(j).address.contains("경기")) {
							aparty.gyeongGiCount++;
						}
						if (people.get(j).address.contains("부산")) {
							aparty.busanCount++;
						}
						if (people.get(j).address.contains("제주")) {
							aparty.jejuCount++;
						}
					} else if (people.get(j).party.equals("B")) {
						bparty.Favorite20Count++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							bparty.Favorite20Count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) {
							aparty.Favorite30Count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							bparty.Favorite40Count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							bparty.Favorite50Count++;
						} else if (people.get(j).age >= 60) {
							bparty.Favorite60Count++;
						}
						if (people.get(j).address.contains("서울")) {
							bparty.seoulCount++;
						}
						if (people.get(j).address.contains("경기")) {
							bparty.gyeongGiCount++;
						}
						if (people.get(j).address.contains("부산")) {
							bparty.busanCount++;
						}
						if (people.get(j).address.contains("제주")) {
							bparty.jejuCount++;
						}
					} else if (people.get(j).party.equals("C")) {
						cparty.Favorite20Count++;
						if (people.get(j).age >= 20 && people.get(j).age < 30) {
							cparty.Favorite20Count++;
						} else if (people.get(j).age >= 30 && people.get(j).age < 40) {
							cparty.Favorite30Count++;
						} else if (people.get(j).age >= 40 && people.get(j).age < 50) {
							cparty.Favorite40Count++;
						} else if (people.get(j).age >= 50 && people.get(j).age < 60) {
							cparty.Favorite50Count++;
						} else if (people.get(j).age >= 60) {
							cparty.Favorite60Count++;
						}
						if (people.get(j).address.contains("서울")) {
							cparty.seoulCount++;
						}
						if (people.get(j).address.contains("경기")) {
							cparty.gyeongGiCount++;
						}
						if (people.get(j).address.contains("부산")) {
							cparty.busanCount++;
						}
						if (people.get(j).address.contains("제주")) {
							cparty.jejuCount++;
						}
					}
				}
				System.out.println(aparty);
				System.out.println(bparty);
				System.out.println(cparty);
			} else if (number.equals("quit")) {
				break;
			}
		}
	}
}
