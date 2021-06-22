import java.util.Arrays;
import java.util.Scanner;

public class a111 {
	public static void main(String[] args) {
		String name = "abcde";
        String[] arr = name.split("");
        String answer= "";
        
        if(arr.length%2 == 1) {
            answer = arr[(int)Math.ceil((double)arr.length/2)];
        }
        else {
        	answer = arr[(arr.length/2)-1]+arr[(arr.length/2)+1];
        }
        System.out.println(answer);
	}
}
