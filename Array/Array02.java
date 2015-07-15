package Array;
/*(Reverse the numbers entered ) Write a program that reads ten integers and dis-
plays them in the reverse of the order in which they were read.*/
import java.util.Scanner;
import java.util.Arrays;
public class Array02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int[] list = new int[10];
		
		for(int i = 0; i < 10; i++) {
			list[i] = input.nextInt();
			System.out.print(list[i] + (((i+1)%10==0)? "\n":" "));
		}
		reverse(list);
		
	}
	public static void reverse(int[] list) {
		
		
		for(int i = 0; i < list.length/2; i++) {
			int temp = list[i];
			list[i] = list[(list.length-1)-i];
			list[(list.length-1)-i] = temp;
			//

		}
		System.out.print(Arrays.toString(list));  
	}
}
