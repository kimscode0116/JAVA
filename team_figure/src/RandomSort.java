import java.util.Arrays;
import java.util.Random;

public class RandomSort {
	public static void main(String[] args) {
		int[] arr = new int[20];
		sort(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = r.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) { // for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[j - 1]) {
					swap(arr, j, j - 1);

				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}