package Loop;
/*(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter ten numbers, and displays the mean
and standard deviations of these numbers using the following formula:*/
import java.util.Scanner;

public class Loop47 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double mean = 0;
	double deviation = 0;
	
	System.out.println("Enter 10 numbers: ");
	for (int i = 0; i < 10; i++) {
		double n = input.nextDouble();
		
		mean += n; 
		deviation += n*n;
	}
	deviation = Math.sqrt((deviation - (mean * mean)/10)/9);
	
	System.out.println("The mean is " + mean/10);
	System.out.println("The standart deviation is " + deviation);
	}
}
