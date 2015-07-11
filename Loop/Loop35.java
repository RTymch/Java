package Loop;
/*(Summation) Write a program to compute the following summation.*/
public class Loop35 {
	public static void main(String[] args) {
		double sum = 0;
		for (int x = 1; x <= 624; x++) {
			sum += (1 / (Math.sqrt(x) + Math.sqrt(x + 1)));
		}
		System.out.print(sum);
	}
}
