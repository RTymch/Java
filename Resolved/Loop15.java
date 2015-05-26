/*(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~ . Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space.*/

public class Loop15 {
	public static void main(String[] args) {
		
		int start = 33;
		final int finish = 126;
		int count = 1;
		
		while (start <= finish) {
			System.out.print((char)start + ((count % 10 == 0)? "\n" : " "));
			count++;
			start++;	
		}
	}
}
