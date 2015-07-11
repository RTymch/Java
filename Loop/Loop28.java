package Loop;
/*Write a program that prompts the user to
enter the year and first day of the year, and displays the first day of each month in
the year on the console. For example, if the user entered the year 2013 , and 2 for
Tuesday, January 1, 2013, your program should display the following output:

January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday*/
import java.util.Scanner;

public class Loop28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year and the first day of the year: ");
		int year = input.nextInt();
		int day = input.nextInt();
		String w = "";
		String m = "";
		
		
		
		
		
		for(int month = 1; month <= 12; month++) {
			switch(month) {
			case 1: m = "January"; break;
			case 2: m = "February"; break;
			case 3: m = "March"; break;
			case 4: m = "April"; break;
			case 5: m = "May"; break;
			case 6: m = "June"; break;
			case 7: m = "July"; break;
			case 8: m = "August"; break;
			case 9: m = "September"; break;
			case 10: m = "October"; break;
			case 11: m = "November"; break;
			case 12: m = "December"; break;
			}
			
			switch(day) {
			case 1: w = "Monday"; break;
			case 2: w = "Tuesday"; break;
			case 3: w = "Wednesday"; break;
			case 4: w = "Thursday"; break;
			case 5: w = "Friday"; break;
			case 6: w = "Saturday"; break;
			case 7: w = "Sunday"; break;
			}	
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				
			}
		}
	}
}
