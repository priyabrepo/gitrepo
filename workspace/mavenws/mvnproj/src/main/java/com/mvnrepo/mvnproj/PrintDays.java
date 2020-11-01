package com.mvnrepo.mvnproj;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintDays {

	public static void main(String[] args) {

		
		String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int thisYear = 2020;
		int thisMonth = 10;

		Calendar cal = new GregorianCalendar(thisYear, thisMonth, 1);
		int lastdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int r = 0; r <= lastdate; r++) {

			Calendar cal1 = new GregorianCalendar(thisYear, thisMonth, r);

			int day = cal1.get(Calendar.DAY_OF_WEEK);
			String DayName = dayName[day - 1];
			System.out.print(r+1 + "," + thisMonth + "," + thisYear + " - ");
			System.out.println(DayName);

		}
	}

}
