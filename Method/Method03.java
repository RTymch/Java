/*(Palindrome integer) Write the methods with the following headers
 * 
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome . A number is a palin-
drome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.*/

package Method;
import java.util.Scanner;
public class Method03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print(isPalindrome(number));
	}
	public static int reverse(int number) {
		int x = 0;
		while (number != 0) {
			x = x * 10 + (number % 10);
			number = number /10;
		}
		return x;
		
	}
	public static boolean isPalindrome(int number) {
		if (reverse(number) == number)
			return true;
		return false;
	}
}
