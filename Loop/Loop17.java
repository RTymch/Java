package Loop;
/*(Display pyramid ) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run
*/

import java.util.Scanner;

public class Loop17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer from 1 to 15: ");
		int number = input.nextInt();
		
		
		
		for (int i = 1; i <= number; i++) {      // на цьому я й зупинився. намагався пробіл присвоїти змінній, і потім множити, але так не працює. 
			for (int x = number-1; x > 0; x--) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
}
