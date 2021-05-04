package project0504;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class date {
	public static void main(String[] args) throws ParseException {
//		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
//		System.out.println(timestamp);
//
////		System.out.println(Calendar.getInstance().getTime());
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse("2020-10-01");
//		Calendar cal = sdf.getCalendar();
//
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//		Date date1 = sdf1.parse("2020-11-21");
//		Calendar cal1 = sdf1.getCalendar();
//		
//		System.out.println(cal.getTime());
//		System.out.println(cal1.getTime());
//		
//		long time1 = cal.getTimeInMillis();
//		long time2 = cal1.getTimeInMillis();
//		
//		long diffTime = time1-time2;
//		long days = diffTime/1000/60/60/24; //ms, 초, 분, 시간 으로 나눠주는것

//		System.out.println(days);
		
		Scanner sc = new Scanner(System.in);
		String todayStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		System.out.println("오늘날짜 : " + todayStamp);
			
		
		System.out.print("기념일 : ");
		String userInput = sc.nextLine();
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
		Date parseDate = sdf3.parse(userInput);
		Date todayDate = sdf3.parse(todayStamp);
		long clacDate = todayDate.getTime() - parseDate.getTime();
		
		long clacDateDays = clacDate/1000/60/60/24;
		
		System.out.println("기념일까지 남은 날짜는 " + Math.abs(clacDateDays)+"일");
		
		
		

	}
}
