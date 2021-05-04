package 자바시험공부;

import java.util.Arrays;
import java.util.Random;

public class Student {
	public static void main(String[] args) {
		Base[] student = { new Base("김은혜"), new Base("님은혜"), new Base("딤은혜") };
		Base[] student2 = { new Base("a"), new Base("b"), new Base("c") };
		Base[] student3 = { new Base("ㄱㄱㄱ"), new Base("ㄴㄴㄴ"), new Base("ㄷㄷㄷ") };

		CC[] cc = { new CC("1반",student), new CC("2반",student2), new CC("3반",student3) };
		for (int i = 0; i < cc.length; i++) {
			cc[i].inputData();
			cc[i].dataClac();
			cc[i].sort();
			cc[i].sortRank();
			cc[i].printData();

		}
		
		for (int i = 0; i < cc.length - 1; i++) {
			for (int j = 1; j < cc.length; j++) {
				if (cc[i].classTotal < cc[j].classTotal) {
					CC temp = cc[i];
					cc[i] = cc[j];
					cc[j] = temp;
				}
			}
		}
		for (int i = 0; i < cc.length; i++) {
			if (i > 0 && cc[i].classAvg == cc[i - 1].classAvg) {
				cc[i].classrank = cc[i - 1].classrank;
			} else
				cc[i].classrank = i + 1;
		}
		for(int i = 0; i < cc.length; i++) {
			System.out.println(i+1 + "등 : " + cc[i].name);
		}

		
		
	}
}
