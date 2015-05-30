/*(Financial application: compare loans with various interest rates) Write a pro-
gram that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8. Here is a sample run:*/

import java.util.Scanner;

public class Loop21 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter loan amount: ");
		int loan = input.nextInt();
		
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		double monthlyPayment = 0;
		double total = 0;
		int count = 0;
		int x = 0;
		
		for (double annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate+= 0.125) {
			double monthlyInterestRate = annualInterestRate / 1200;
			count ++;
			System.out.printf("%3.3f ", annualInterestRate);
			while (x < count){
				monthlyPayment = loan * monthlyInterestRate / (1
						- 1 / Math.pow(1 + monthlyInterestRate, years * 12));
				double totalPayment = monthlyPayment * years * 12;
				
				System.out.printf("%17.2f         ", monthlyPayment);
				System.out.printf("%12.2f \n", totalPayment);
		
				x++;
			}
		}
	}
}
