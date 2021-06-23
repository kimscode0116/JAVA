package 연습;

public class LEVEL1_3 {
	public static void main(String[] args) {
		int a = 1;
		int b = 7;
		String[] dayoftheDay = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] allDayCount = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int arrNum = 5;

		int dayCount = 0;
		if (a == 1) {
			dayCount = 0;
		} else {
			for (int i = 0; i < a - 1; i++) {
				dayCount += allDayCount[i];
			}
		}
		System.out.println("1월부터 총 며칠이 지난 : " + dayCount);
		int clacday = 0;
		int thisMonthFirstDay = 0;

		if (dayCount > 0) {
			clacday = dayCount % 7;
			thisMonthFirstDay = clacday + arrNum;
			if (thisMonthFirstDay >= dayoftheDay.length) {
				thisMonthFirstDay -= dayoftheDay.length;
			}
		} else {
			thisMonthFirstDay = arrNum;
		}
//		System.out.println("날짜세기"+dayCount);
//		System.out.println(thisMonthFirstDay);
//		System.out.println("111   "+clacday);
		int checkDay = 0;
		checkDay = b % 7;
		int thisday = 0;
		thisday = thisMonthFirstDay + checkDay - 1;

		if (thisday >= dayoftheDay.length) {
			thisday = thisday - dayoftheDay.length;
		}
		System.out.println(dayoftheDay[thisday]);
	}
}
