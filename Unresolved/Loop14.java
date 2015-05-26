/*(Compute the greatest common divisor) Another solution for Listing 4.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d to
be the minimum of n1 and n2 , then check whether d , d-1 , d-2 , ..., 2 , or 1 is a
divisor for both n1 and n2 in this order. The first such common divisor is the greatest
common divisor for n1 and n2 . Write a program that prompts the user to enter
two positive integers and displays the gcd.*/

import java.util.Scanner;

public class Loop14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gsd = 1;
	//	int k = 2;
		int d = 0;  // я так зрозумів що d має бути меншим з двох n.
		
		if (n1 < n2)
			d = n1;
		else
			d = n2;
		
		while (d < 0) {
			if (n1 % d == 0 && n2 % d == 0) {   // не можу зрозуміти чому не працює break
				gsd = d;
				break;
			}
			d--;
		}
		
	/*	while (k <= n1 && k <= n2) {        // це варіант вирішення з підручника
			if (n1 % k == 0 && n2 % k == 0)
				gsd = k;
			k++;
		}             */
		
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gsd);
	}
}
