package Method;
/*(Use the Math.sqrt method ) Write a program that prints the following table
using the sqrt method in the Math class.*/
public class Method18 {
	public static void main(String[] args) {
		System.out.println("Number     Square Root");
		getRoot(20);
	}
	public static double getRoot(int num) {
		double root = 0;
		for (int x = 0; x <= num; x+=2) {
			double r = Math.sqrt(x);
			System.out.printf("%-2d \t\t %1.4f\n", x, r);
		}
		return root;
	}
}
