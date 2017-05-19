package com.game.fundamentals;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2017, 3, 4);
		/**
		 * of() method examples
		 */
		System.out.println("Day of year: "+date1.getDayOfYear());
		System.out.println("Day of month: "+date1.getDayOfMonth());
		System.out.println("Day of Week: "+date1.getDayOfWeek());
		/**
		 * now() method examples
		 */
		System.out.println("Current date: "+LocalDate.now());
		
		/**
		 * chronological order date examples
		 */
		LocalDate myBday = LocalDate.of(1992, 3, 4);
		LocalDate sachinBday = LocalDate.of(1992, 3, 24);
		LocalDate surBBday = LocalDate.of(1992, 02, 21);
		
		System.out.println("My birthday before Sachin's? :"+myBday.isBefore(sachinBday));
		System.out.println("My birthday after Surbhi's? :"+myBday.isAfter(surBBday));
		System.out.println("Surbhi's birthday after my birthday? :"+surBBday.isAfter(myBday));
		
		/**
		 * Parsing the date
		 */
		LocalDate date3 = LocalDate.parse("2017-03-17");
		/**
		 * Date manipulation
		 */
		LocalDate date4 = LocalDate.of(2017, 3, 17);
		System.out.println("Added one month to "+date4+" :"+date4.plusMonths(12));
		System.out.println("withDayOfYear() : "+date4.withDayOfYear(35));
//		System.out.println("withDayOfYear() : "+date4.withDayOfYear(366)); //Exception in thread "main" java.time.DateTimeException: Invalid date 'DayOfYear 366' as '2017' is not a leap year
		System.out.println("withDayOfMonth() :"+date4.withDayOfMonth(12));
//		System.out.println("withDayOfMonth() :"+date4.withDayOfMonth(32)); //Invalid value for DayOfMonth (valid values 1 - 28/31): 32
		
		/**
		 * Time conversion of the date 
		 */
		LocalDate interviewTime = LocalDate.of(2017, 02, 21);
		LocalDateTime timeForInterview = interviewTime.atTime(16, 1);
//		LocalDateTime timeForInterview = interviewTime.atTime(25, 1); //Invalid value for HourOfDay (valid values 0 - 23): 25
		System.out.println("Interview time: "+timeForInterview);
		
	}

}
