package afternoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<People> company = new ArrayList<People>();

		while (true) {
			System.out.println("======인사관리 프로그램을 시작합니다.========");
			System.out.println("1. 개인정보 입력");
			System.out.println("2. 개인정보 수정");
			System.out.println("3. 부서별 사원 확인하기");
			System.out.println("4. 종료");

			String pressNum = sc.nextLine();
			if (pressNum.equals("1")) {
				System.out.println("===개인정보 입력===");
				System.out.print("1) 이름 : ");
				String name = sc.nextLine();
				System.out.print("2) 부서 : ");
				String department = sc.nextLine();
				System.out.print("3) 직위 : ");
				String position = sc.nextLine();
				System.out.print("4) 담당업무 : ");
				String duty = sc.nextLine();
				company.add(new People(name, department, position, duty));


			} else if (pressNum.equals("2")) {
				System.out.println("===개인정보 수정===");
				System.out.println("▶ 수정하실 내용은 무엇입니까?");
				System.out.println("1) 이름 2) 부서 3) 직위 4) 담당업무");
				String selectedNum = sc.nextLine();

				System.out.println("▶수정할 사원의 기존 등록된 이름을 입력하세요");
				String editName = sc.nextLine();

				for (int i = 0; i < company.size(); i++) {
					if (!company.get(i).name.equals(editName)) {
						System.out.println("회사에 등록된 이름이 없습니다.");
						break;
					} else if (company.get(i).name.equals(editName) && selectedNum.equals("1")) {
						System.out.println("▶ 새로운 이름을 입력하세요");
						String newName = sc.nextLine();
						company.get(i).name = newName;
						System.out.println(company.get(i).name + " → " + newName + "으로 변경 완료");
						break;
					}

					else if (selectedNum.equals("2") && company.get(i).name.equals(editName)) {
						System.out.println("▶ 새로운 부서를 입력하세요");
						String newPart = sc.nextLine();
						company.get(i).department = newPart;
						System.out.println(
								company.get(i).name + "의" + company.get(i).department + " → " + newPart + "으로 변경 완료");
						break;
					} else if (selectedNum.equals("3") && company.get(i).name.equals(editName)) {
						System.out.println("▶ 새로운 직위를 입력하세요");
						String newPosition = sc.nextLine();
						company.get(i).position = newPosition;
						System.out.println(
								company.get(i).name + "의" + company.get(i).position + " → " + newPosition + "으로 변경 완료");
						break;
					} else if (selectedNum.equals("4") && company.get(i).name.equals(editName)) {
						System.out.println("▶ 새로운 담당업무를 입력하세요");
						String newduty = sc.nextLine();
						company.get(i).duty = newduty;
						System.out.println(
								company.get(i).name + "의" + company.get(i).duty + " → " + newduty + "으로 변경 완료");
						break;
					}

				}
			}
			
		
			
			else if(pressNum.equals("3")) {
				
				System.out.println("부서를 선택해 주세요");
				System.out.println("1) 영업팀 2) 개발팀 3) 인사팀");
				String selectedDepartment = sc.nextLine();
				
				departmentAccess department1 = new departmentAccess("영업팀");
				departmentAccess department2 = new departmentAccess("개발팀");
				departmentAccess department3 = new departmentAccess("인사팀");
				
				if(selectedDepartment.equals("1")) {
					
				}
			}
			
			else if (pressNum.equals("4")) {
				break;
			}
			
		}
	}
}
