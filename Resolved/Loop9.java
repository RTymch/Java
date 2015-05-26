import java.util.Scanner;

/*(Find the two highest scores) Write a program that prompts the user to enter
the number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.*/

public class Loop9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		int max = 0;
		int secondMax = 0;
		String name = "";
		String maxName = "";
		String secondName = "";
		
		System.out.println("Enter number of students: ");
		int students = input.nextInt();
		
		System.out.println("Enter name and score for each student: ");
		
		for (int i = 0; i < students; i++) {
			name = input.next();
			score = input.nextInt();
			
			if (score > max) {
				secondMax = max;
				max = score;
				secondName = maxName;
				maxName = name;
			}
		}
		System.out.println("The student's name with highest score is " + maxName);
		System.out.println("The student's name with second highest score is " + secondName);
	}
}
