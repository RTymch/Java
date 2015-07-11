package Loop;
/*(Simulation: clock countdown) Write a program that prompts the user to enter the
number of seconds, displays a message at every second, and terminates when the
time expires*/
import java.util.Scanner;

public class Loop43 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		int sec = input.nextInt();
		
		for (int i = sec; i > 0; sec--) {
			System.out.println();
		}
		
	}
}
