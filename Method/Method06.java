package Method;
/*Write a method to display a pattern as follows:
1
2 1
3 2 1
...
n n-1 ... 3 2 1Programming Exercises 213
The method header is
public static void displayPattern(int n)*/
import java.util.Scanner;
public class Method06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number not bigger than 10: ");
		int n = input.nextInt();
		
		displayPattern(n);
	}
	public static void displayPattern(int n){
		for(int i = 1; i <= n; n++){
			for(int x = 1; x <= i; x++){
				System.out.print(i);
			}
		}
	}
}
