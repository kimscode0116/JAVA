import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int [20];
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int indexLowest(int[]arr, int start) {
		int lowIndex = start;
		for(int i = start; i < arr.length; i++) {
			if(arr[i] < arr[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}
	public static void selectionSort (int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int j = indexLowest(arr, i);
			swapElements(arr,i,j);
		}
	}
	public static void swapElements(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
}
