package Loop;
/*(Display prime numbers between 2 and 1,000) Modify Listing 4.14 to display all
the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.*/

public class Loop20 {
	public static void main(String[] args) {
		 final int finish = 1000;
		 int number = 2;
		 int count = 0;
		 
		 while (number <= finish) {
			 for (int x = 2; x < finish; x++) {
				 if (number % x == 0)
					 break;
				 else
					 System.out.print(number + " ");
			 }
			 number++;
			
		 }
		
	}
}
