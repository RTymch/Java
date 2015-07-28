package Method;
/*(Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number of
years. The future investment is determined using the formula in Programming
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59 .
Write a test program that prompts the user to enter the investment amount (e.g.,
1000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30, as shown below:

futureInvestmentValue =
investmentAmount x (1 + monthlyInterestRate) numberOfYears*12
*/
import java.util.Scanner;
public class Method07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount and interest rate: ");
		double investmentAmount = input.nextDouble();
		double monthlyInterestRate = input.nextDouble();
		int years = 30;
		System.out.println("Years \t\t Future Value");
		
		futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
	}
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years){
		double futureInvestmentValue = 0;
		for (int i = 1; i <= years; i++) {
			futureInvestmentValue = investmentAmount * (Math.pow((1 + (monthlyInterestRate * 0.01)), i));
			System.out.printf("%-5d \t\t %5.2f \n", i, futureInvestmentValue);
		}
		return futureInvestmentValue;
	}
}
