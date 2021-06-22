package 연습;

public class LEVEL1_3 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		String[] dayoftheDay = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] allDayCount = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
		int arrNum = 5;

		int dayCount = 0;
		for (int i = 0; i < a - 1; i++) {
			dayCount += allDayCount[i];
		}
		int clacday = dayCount % 7;
		int thisMonthFirstDay = clacday + arrNum;
		if (thisMonthFirstDay >= dayoftheDay.length) {
			thisMonthFirstDay -= dayoftheDay.length;
		}
		System.out.println(thisMonthFirstDay);
		
		int checkDay = b%7;
		if (checkDay >= dayoftheDay.length) {
			checkDay = checkDay-dayoftheDay.length-1;
		}
		System.out.println(dayoftheDay[checkDay]);

		
	}
}
