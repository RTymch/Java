package Array;
/*(Print distinct numbers) Write a program that reads in ten numbers and displays
distinct numbers (i.e., if a number appears multiple times, it is displayed only
once). (Hint: Read a number and store it to an array if it is new. If the number is
already in the array, ignore it.) After the input, the array contains the distinct numbers.*/
import java.util.Scanner;
import java.util.Arrays;
public class Array05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] list = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int x = input.nextInt();
			
			if(list[i] != x)
				list[x] = x;
		}
		
		for(int a: list)
			System.out.print(a + " ");
	}
}
