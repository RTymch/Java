package Loop;
/*(Find the largest n such that n**3 < 12,000) Use a while loop to find the largest
integer n such that n**3 is less than 12,000.*/
public class Loop13 {
	public static void main(String[] args) {
		
		final int number = 12000;
		int n = 0;
		
		while (n*n*n < number) {
			n++;
		}
		System.out.println(n-1); // в цьому місці вдався до отакого -1. як можна зробити без таких милиць?
	}
}
