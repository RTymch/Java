package Loop;
/*In computing the following series, you will obtain
more accurate results by computing from right to left rather than from left to right:
Write a program that computes the results of the summation of the preceding
series from left to right and from right to left with n = 50000*/

public class Loop23 {
	public static void main(String[] args) {
		int n = 50000;
		double sum = 0;
		double sum2 = 0;
		for (double x = 1.0; x <= n; x++) {
			sum += 1 / x;		
		}
		
		for (double i = 50000; i >= 1; i--) {
			sum2 = 1.0 / i;
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
}
