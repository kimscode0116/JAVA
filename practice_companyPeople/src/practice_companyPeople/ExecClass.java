package practice_companyPeople;

import java.util.Scanner;

//import com.kopo.People;

public class ExecClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Part[] part = {new Part("인사팀"),new Part("개발팀"),new Part("영업팀")};
		while(true) {
			System.out.println("====직원관리 프로그램을 시작합니다====");
			System.out.println("1) 직원 정보 입력");
			System.out.println("2) 직원 정보 출력");
			System.out.println("3) 직원 정보 수정");
			System.out.println("4) 부서별 직원 정보 확인");
			
			String pressNum = sc.nextLine();
			if(pressNum.equals("1")) {
				People tempPeople = new People();

				System.out.print("▶ 이름 : ");
				tempPeople.name = sc.nextLine();
				System.out.print("▶ 직급 : ");
				tempPeople.position = sc.nextLine();
				System.out.print("▶ 업무 : ");
				tempPeople.duty = sc.nextLine();
				System.out.print("▶ 부서 : ");
				String department = sc.nextLine();
				
				if(department.equals("인사팀")) {
					part[0].member.add(tempPeople);
				}
				else if(department.equals("개발팀")) {
					part[1].member.add(tempPeople);
				}
				else if(department.equals("영업팀")) {
					part[2].member.add(tempPeople);
				}
			}
			else if(pressNum.equals("2")) {
				for(int i = 0; i < part.length; i++) {
					System.out.println(part[i].member.get(i).name));
				}
			}
			
		}
		
	}
}
