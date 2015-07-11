package Loop;
import java.util.Scanner;

/*(Occurrence of max numbers) Write a program that reads integers, finds the
largest of them, and counts its occurrences. Assume that the input ends with
number 0 . Suppose that you entered 3 5 2 5 5 5 0 ; the program finds that the
largest is 5 and the occurrence count for 5 is 4 .
(Hint: Maintain two variables, max and count . max stores the current max num-
ber, and count stores its occurrences. Initially, assign the first number to max
and 1 to count . Compare each subsequent number with max . If the number is
greater than max , assign it to max and reset count to 1 . If the number is equal to
max , increment count by 1 .)*/
public class Loop41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = 0;
		
		int max = 0;
		int count = 1;
		
		while (true) {        
			number = input.nextInt();
			
			if (number == max)
				count++;
			else if (number > max){
				max = number;
				count = 1;}
			else if (number == 0)
				break;
		}             
		System.out.println(max);
		System.out.println(count);
	}
}
