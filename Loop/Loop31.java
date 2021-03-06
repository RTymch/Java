package Loop;
/*(Financial application: compute CD value) Suppose you put $10,000 into a CD
with an annual percentage yield of 5.75%. After one month, the CD is worth
10000 + 10000 * 5.75 / 1200 = 10047.91
After two months, the CD is worth
10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
After three months, the CD is worth
10096.06 + 10096.06 * 5.75 / 1200 = 10144.43
and so on.
Write a program that prompts the user to enter an amount (e.g., 10000 ), the annual
percentage yield (e.g., 5.75 ), and the number of months (e.g., 18 ) and displays a
table as shown in the sample run.*/

import java.util.Scanner;
public class Loop31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amont: ");
		int amount = input.nextInt();
		
		System.out.print("Enter annual percentage yield: ");
		double percent = input.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();
		
		System.out.println("Month \t\t\t CD Value");
		
		//double sum=0;
		int y = 0;
		for(int x = 1; x <= months; x++) {
			amount += amount * (percent / 1200);
			y++;
			System.out.println( y+"      "+ amount);
		}
	}
}
