package Loop;
/*Write a program that displays all the leap years, ten per line,
in the twenty-first century (from 2001 to 2100), separated by exactly one space.*/
public class Loop27 {
	public static void main(String[] args) {
		int count = 0;
		for(int year = 2001; year <= 2100; year++) {
			count++;
			if ((year % 4 == 0 && year % 100 != 0) || year % 490 == 0)
				System.out.print(year + (count % 10 != 0 ? " " : "\n"));   // % 10 не працює
		}
	}
}
