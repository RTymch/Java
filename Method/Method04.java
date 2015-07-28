/*(Display an integer reversed ) Write a method with the following header to display
an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543 . Write a test program that prompts
the user to enter an integer and displays its reversal.*/

package Method;
import java.util.Scanner;
public class Method04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		reverse(number);
	}
	public static void reverse(int number) {
		int x = 0;
		while (number != 0) {
			x = x * 10 + (number % 10);
			number = number /10;
		}
		System.out.print(x);
	}
}
