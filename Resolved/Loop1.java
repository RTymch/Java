import java.util.Scanner;

/*Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0 . Display
the average as a floating-point number.*/

public class Loop1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = 0;
		
		int total = 0;
		int positive = 0;
		int negative = 0;
		int sum = 0;
		double average = 0;
		
		while (true) {         // питання - чому в умові циклу true? написав методом тика, але не розумію
			number = input.nextInt();
			
			if (number > 0)
				positive++;
			else if (number < 0)
				negative++;
			else 
				break;
			
			total++;
			sum += number;
		}                          
		
		average = (double)sum / total;
		
		if (total == 0)
			System.out.println("No numbers are entered except 0");
		else{
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.println("The total is " + total);
			System.out.printf("The average is %3.2f", average);  
		}	
	}
}
