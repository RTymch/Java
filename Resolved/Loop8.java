import java.util.Scanner;

/*(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name of the
student with the highest score.*/

public class Loop8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		int max = 0;
		String name = "";
		String maxName = "";
		
		System.out.println("Enter number of students: ");
		int students = input.nextInt();
		
		System.out.println("Enter name and score for each student: ");
		
		for (int i = 0; i < students; i++) {
			name = input.next();
			score = input.nextInt();
			
			if (score > max) {
				max = score;
				maxName = name;
			}
		}
		System.out.println(maxName);
	}
}
