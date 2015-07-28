/*(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
to extract digits, and the / operator to remove the extracted digit. For instance, to
extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
(= 23). Use a loop to repeatedly extract and remove the digit until all the digits are
extracted. Write a test program that prompts the user to enter an integer and dis-
plays the sum of all its digits*/

package Method;
import java.util.Scanner;

public class Method02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		
		
		System.out.print(sumDigits(num));
	}
	public static int sumDigits (int num) {
		int x = 0;
		while (num % 10 != 0) {
			x += (num % 10);
			num = num /10;
		}
		return x;
	}
}
