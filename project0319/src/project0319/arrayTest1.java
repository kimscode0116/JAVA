package project0319;

import java.util.Arrays;
import java.util.Random;

public class arrayTest1 {
public static void main(String[] args) {
	double number[] = new double[10];
	// double number[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
			
	Random r1 = new Random();
	for(int i = 0; i < number.length; i++) {
		number[i] = r1.nextDouble();
	}
	
	System.out.println(Arrays.toString(number));
	
	Arrays.sort(number);
	System.out.println(Arrays.toString(number)) ;
}
}
