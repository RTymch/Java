package Method;
/*(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(
double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.*/

import java.util.Scanner;
public class Method05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble(); 
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double min = 0;
		double max = 0;
		double mid = 0;
		
		if(num1 < num2){
			if(num2 < num3){
				min = num1;
				mid = num2;
				max = num3;
			}
			else{
				min = num1;
				mid = num3;
				max = num2;
			}
		}
		else if(num2 < num1){
			if(num1 < num3){
				min = num2;
				mid = num1;
				max = num3;
			}
			else{
				min = num2;
				mid = num3;
				max = num1;
			}		
		}	
		else{
			if(num2 < num1){
				min = num3;
				mid = num1;
				max = num2;
			}
			else{
				min = num3;
				mid = num2;
				max = num1;
			}
		}
		
		System.out.print(min + " " + mid + " " + max);
	}
}
