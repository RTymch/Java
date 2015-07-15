package Array;
/*Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0*/
import java.util.Scanner;
import java.util.Arrays;
public class Array03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int ls = 10;
		int[] list = new int[ls];
		int count = 0;
				
		for(int i = 0; i < ls; i++) {
			list[i] = input.nextInt();
			count++;
			if(list[i] == 0)
				break;			
		}
		
		occ(list);
		
		
		
		
	}
	public static void occ(int[] list) {
		int[] occ = new int[list.length];
		for (int a: list){
			occ[a]++;
			System.out.println(list[a] + " occurs " + occ[a] + " times" );
		}
		
	}
}
