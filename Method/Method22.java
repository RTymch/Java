package Method;
/*(Math: approximate the square root) There are several techniques for implement-
ing the sqrt method in the Math class. One such technique is known as the
Babylonian method. It approximates the square root of a number, n , by repeatedly
performing a calculation using the following formula:

nextGuess = (lastGuess + n / lastGuess) / 2

When nextGuess and lastGuess are almost identical, nextGuess is the
approximated square root. The initial guess can be any positive value (e.g., 1 ).
This value will be the starting value for lastGuess . If the difference between
nextGuess and lastGuess is less than a very small number, such as 0.0001 ,
you can claim that nextGuess is the approximated square root of n . If not,
nextGuess becomes lastGuess and the approximation process continues.
Implement the following method that returns the square root of n .*/

import java.util.Scanner;
public class Method22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		long n = input.nextLong();
		
		System.out.print("The square root of number " + n + " is " + sqrt(n));
	}
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = 100;
		while (true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if(lastGuess - nextGuess <= 0.0001) {
				break;
			}
			else
				lastGuess = nextGuess;
		}
		return nextGuess;
	}
}
