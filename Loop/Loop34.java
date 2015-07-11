package Loop;
/*(Game: scissor, rock, paper) Exercise 3.17 gives a program that plays the scissor-
rock-paper game. Revise the program to let the user continuously play until
either the user or the computer wins more than two times.*/
import java.util.*;

public class Loop34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissors(0), paper(1), rock(2)");
		int player = input.nextInt();
		int comp = ((int)(Math.random() * 3));
		System.out.println(comp);
		
		if(player == comp)
			System.out.println("Again");
		else if(player == 0 && comp == 2 || player == 1 && comp == 0 || player == 2 && comp == 1)
			System.out.println("Player loose");
		else
			System.out.println("Player won");
		
	}
}
