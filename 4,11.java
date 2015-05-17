import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		final int maximal = 200;
		int count = 0;
		
		for (int i = 100; i < maximal; i++){
			if ((i % 5 == 0 && i % 6 != 0) || (i % 6 == 0 && i%5 != 0 )){
				
				count++;
				System.out.print(i + ((count%10 != 0) ? " " : "\n"));
				
			}	
		}	
	}	
}