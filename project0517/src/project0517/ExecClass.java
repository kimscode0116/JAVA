package project0517;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import jdk.internal.org.jline.reader.impl.DefaultParser.Bracket;

public class ExecClass {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/sample_input.txt"));

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		int X = 0;
		int Y = 0;

		for (int i = 0; i < 1; i++) {
			String[] s = sc.nextLine().split(" ");
			String[] brackets = s[1].split("");
			int number = Integer.parseInt(s[0]);
			for (int j = 0; j < brackets.length; j++) {
				if (brackets[number].equals("(")) {
					for(int k = 0; k<number; k++) {
						
					}
				} else if (brackets[j].equals(")")) {

				}
			}
			System.out.println(Arrays.toString(brackets));
		}
		System.out.println(X);
		System.out.println(Y);
	}
}
