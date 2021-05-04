package project0504;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Anniversary_dayclass {
	Calendar dDay;
	int days;

	Anniversary_dayclass(String dateString) {
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf1.parse(dateString);
			this.dDay = sdf1.getCalendar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void calulaionDDAY() {
		long now = Calendar.getInstance().getTimeInMillis();
		long ddayTime = this.dDay.getTimeInMillis();
		
		long diffTime = now - ddayTime;
		this.days = (int)Math.ceil((double)diffTime/1000/60/60/24);

	}
	@Override
	public String toString() {
		return "D-day : " + this.days;
	}

}
