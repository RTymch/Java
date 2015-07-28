package Method;
/*(Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.*/
public class Method16 {
	public static void main(String[] args) {
		System.out.print(numberOfDaysInAYear(2000));
	}
	public static int numberOfDaysInAYear(int year) {
		int count = 0;
		while(year <= 2020) {
			if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
				count += 365;
			else
				count += 366;
			year++;
		}
		return count;
	}
}
