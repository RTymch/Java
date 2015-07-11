package Loop;
/*(Financial application: loan amortization schedule) The monthly payment for a
given loan pays the principal and the interest. The monthly interest is computed by
multiplying the monthly interest rate and the balance (the remaining principal).
The principal paid for the month is therefore the monthly payment minus the
monthly interest. Write a program that lets the user enter the loan amount, number
of years, and interest rate and displays the amortization schedule for the loan.*/
import java.util.Scanner;

public class Loop22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println();
		
		System.out.printf("Monthly payment: %3.2f \n", monthlyPayment);
		System.out.printf("Total payment: %3.2f \n", totalPayment);
		System.out.println();
		
		System.out.println("Payment\t\tInterest\t\tPrincipal\t\tBalance");
		
		double balance = loanAmount;
		for (int i = 1; i <= numberOfYears; i++) {
			double interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-2d \t\t %3.2f \t\t\t %3.2f \t\t\t %3.2f \n",i, interest, principal, balance);
			
		}
	}
}
