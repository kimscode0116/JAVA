package project0504;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String day = "";
		System.out.println("당신의 2022년 생일은?");
		String date = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date nDate = dateFormat.parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);

		int dayNum = cal.get(Calendar.DAY_OF_WEEK);

		switch (dayNum) {
		case 1:
			day = "일";
			break;
		case 2:
			day = "월";
			break;
		case 3:
			day = "화";
			break;
		case 4:
			day = "수";
			break;
		case 5:
			day = "목";
			break;
		case 6:
			day = "금";
			break;
		case 7:
			day = "토";
			break;

		}
		System.out.println(day);
	} // class end
} // main end
