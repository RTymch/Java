package Loop;
/*(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d 1 d 2 d 3 d 4 d 5 d 6 d 7 d 8 d 9 d 10 . The last digit, d 10 , is a checksum,
which is calculated from the other nine digits using the following formula:
(d 1 * 1 + d 2 * 2 + d 3 * 3 + d 4 * 4 + d 5 * 5 +
d 6 * 6 + d 7 * 7 + d 8 * 8 + d 9 * 9) % 11
If the checksum is 10 , the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:*/
import java.util.Scanner;

public class Loop36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int dig = 0;
		System.out.print("Enter 9 digits: ");
		
		for (int i = 1; i <= 9; i++) {
			dig = input.nextInt();
			System.out.print(dig);
			sum += (dig * i);
		}
		int x = sum % 11;
		
		System.out.println((x == 10)? "X": x);
	}
}
