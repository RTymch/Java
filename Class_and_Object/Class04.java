package Class_and_Object;

import java.util.Random;

/**(Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.*/
public class Class04 {

	public static void main(String[] args) {
		
		Random ran = new Random(1000);
		for(int i = 0; i < 50; i++) {
			System.out.print(ran.nextInt(100) + " ");
		}
	}

}
