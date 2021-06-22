import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Final_exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();
		String[] makeArr = userInput.split(",");
		
		int[] newIntArr = Arrays.stream(makeArr).mapToInt(Integer::parseInt).toArray();

		int divisor = newIntArr[0];
		ArrayList<Integer> resultArr = new ArrayList<Integer>();

		for (int i = 1; i < newIntArr.length; i++) {
			if (newIntArr[i] % divisor == 0) {
				resultArr.add(newIntArr[i]);
			} else
				continue;
		}

		int[] finalResult = new int[resultArr.size()];

		if (resultArr.size() == 0) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < resultArr.size(); i++) {
				finalResult[i] = resultArr.get(i);
			}
		}
		Arrays.sort(finalResult);
		resultArr.get(0);
		System.out.println(Arrays.toString(finalResult));
	}
}
