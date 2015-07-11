package Loop;
/*(Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):*/
// аналогічно до попереднього завдання. від 1 до 10
public class Loop4 {
	public static void main(String[] args) {
		final int miles = 10;
		double kilometers = 0;
		
		System.out.println("Miles     Kilometers");
		
		for (int i = 1; i <= miles; i++) {
			kilometers = i * 1.609;
			System.out.printf("%-9d %-10.3f \n", i, kilometers);
		}

	}
}
