package Loop;
/*(Math: combinations) Write a program that displays all possible combinations for
picking two numbers from integers 1 to 7 . Also display the total number of all
combinations.*/
public class Loop45 {
	public static void main(String[] args) {
		int count = 0;
		for(int x = 1; x <= 7; x++) {
			for(int y = (x + 1); y <= 7; y++) {
				count++;
			}
		}
		System.out.print(count);
	}
}
