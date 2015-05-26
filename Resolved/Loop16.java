import java.util.Scanner;

/*(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is 120 ,
the output should be as follows: 2 , 2 , 2 , 3 , 5 .*/

// те визначення фактору числа яке я знайшов різниться від того прикладу що поданий тут. 
// до того ж я не надто розумію значення smallest. до 10-ти?
// тому у мене всі

public class Loop16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter positive integer: ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.print(i + ((i != number)? ", " : "."));
			
		}
	}
}
