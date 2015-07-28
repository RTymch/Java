package Method;
/*(Sum series) Write a method to compute the following series:
m(i) = 1/2 + 2/3 + ... + i/i+1
*/
public class Method13 {
	public static void main(String[] args) {
		System.out.println("i \t m(i)");
		System.out.println("--------------");
		sumOfSet(20);
	}
	public static double sumOfSet(int max_i) {
		double m = 0;
		for(int i = 1; i <= max_i; i++) {
		m += i / (double)(i + 1);
			System.out.printf("%-2d \t %2.4f\n", i, m);
		
		}
		return m;
	}
}
