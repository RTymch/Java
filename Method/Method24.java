package Method;
/*(Display current date and time) Listing 2.6, ShowCurrentTime.java, displays the
current time. Improve this example to display the current date and time. The cal-
endar example in Listing 5.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.*/

public class Method24 {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		
		time(totalMilliseconds);
	}
	public static void time(long totalMilliseconds) {
		
		long totalSeconds = totalMilliseconds / 1000;
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		// Compute the current hour
		long currentHour = totalHours % 24;
		 
		
		System.out.println("Current time is " + (currentHour + 3) + ":" + currentMinute + ":" + currentSecond);
	}
}
