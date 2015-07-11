package Loop;
/*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are sepa-
rated by exactly one space.*/

public class Loop10 {
	public static void main(String[] args) {
		
		int from = 100;     // я розумію що такі імена змінним не дають, але воно якось зрозуміліше)
		int to = 1000;
		int count = 0;
		
		while(from <= to) {
			from++;
			if (from % 5 == 0 && from % 6 == 0){
				count++;
				System.out.print(from + ((count % 10 == 0) ? "\n" : " ")); 
			}
			
		}
	}
}
