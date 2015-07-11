package Loop;
/*(Find the smallest n such that n**2 > 12,000) Use a while loop to find the smallest
integer n such that n**2 is greater than 12,000.*/

public class Loop12 {
	public static void main(String[] args) {
	
		final int number = 12000;
		int n = 0;     
		
		while (n*n < number) {
			n++;
		}
		System.out.println(n);
	}
}
