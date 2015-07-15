package Array;
/*(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.*/
import java.util.Scanner;
import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a scores: ");
		double sum = 0;
		int count = -1;
		
		double[] list = new double[10];
		for(int i = 0; i < list.length; i++) {
		
			list[i] = input.nextInt();
			count ++;
			if(list[i] < 0){
				break;}
			
				
			sum += list[i];	
		}
		
		double mid = sum / count;
		int above = 0;
		int below = 0;
		int equal = 0;
		
		for(int a = 0; a < count; a++){
			if(list[a] == mid)
				equal ++;
			else if(list[a] > mid)
				above ++;
			else
				below ++;
		}
		System.out.println(equal + "equal");
		System.out.println(above + "above");
		System.out.println(below + "below");
		System.out.println(mid + "middle");
		System.out.println(count);
	}

}
