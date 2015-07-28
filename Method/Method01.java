package Method;
/*(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . ..
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal num-
bers with 10 numbers on each line.*/

public class Method01 {
	public static void main(String[] args) {
		int number = 100;
		
		for (int n = 1; n <= number; n++) {
		
			System.out.print(getPentagonalNumber(n) + ((n % 10 == 0)? "\n" : " "));
		}
	}
	
	public static int getPentagonalNumber(int n){
		int pentagon = n*(3*n - 1)/2;
		
		return pentagon;	
	} 
}
