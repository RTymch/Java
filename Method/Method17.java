package Method;
/*(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix.*/
import java.util.Scanner;
public class Method17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);

	}
	public static void printMatrix(int n) {		
		
		for (int i = 0; i < n; i++) {
			for(int a = 0; a < n; a++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println("");
		}
		
	}
	
}
