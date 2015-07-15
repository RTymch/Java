package Array;
/*(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is 7= best - 10
Grade is B if score is 7= best - 20 ;
Grade is C if score is 7= best - 30 ;
Grade is D if score is 7= best - 40 ;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades.*/
import java.util.Scanner;
public class Array01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int number = input.nextInt();
		
		int[] students = new int [number];
		System.out.print("Enter " + number + " score: ");
		for(int i = 0; i < students.length; i++) {
			students[i] = input.nextInt();
		}
		grade(students);
	}
	public static void grade(int[] students) {
		char[] g = new char[students.length];
		for(char i = 65; i-65 < students.length; i++) {
			g[i-65] = (char)i;
		}
		
		int index = 0;
		int best = students[0];
		for(int i = 0; i < students.length; i++) {
			if(students[i] > best){
				best = students[i];
				index = i;
			}
			// не розумію яким чином прив’язати g[], щоб g[0] була біля найбільшого показника і т.д.
			System.out.println("Student " + i + " score is " + students[i] + 
					" and grade is " + g[i]);
		}
	}
}
