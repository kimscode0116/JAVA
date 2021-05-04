package practice0430;

import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "글자 입력 : ");
		String apple = sc.nextLine();
		
		StringBuffer a = new StringBuffer(apple);
		a.reverse();
		System.out.println(a);
	}
}
