/*(Find numbers divisible by 5 or 6, but not both) Write a program that displays all
the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both.
Numbers are separated by exactly one space.*/

public class Loop11 {
	public static void main(String[] args) {
		
		int from = 100;     
		int to = 200;
		int count = 0;
		
		while(from <= to) {
			from++;
			if (from % 5 == 0 && from % 6 != 0 || from % 5 != 0 && from % 6 == 0){
				count++;
				System.out.print(from + ((count % 10 == 0) ? "\n" : " ")); 
			}
			
		}
	}
}
