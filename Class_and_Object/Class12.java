package Class_and_Object;
import java.util.Scanner;

/**Exercise 3.3 for sample runs.
(Geometry: intersection) Suppose two line segments intersect. The two endpoints
for the first line segment are ( x1 , y1 ) and ( x2 , y2 ) and for the second line segment
are ( x3 , y3 ) and ( x4 , y4 ). Write a program that prompts the user to enter these four
endpoints and displays the intersecting point. (Hint: Use the LinearEquation
class in Exercise 8.11.)*/
public class Class12 {
	  // Hint: Use the LinearEquation class in Exercise 8.11 як? тут потрібна точка перетину. 
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the endpoints of the first line segment: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("Enter the endpoints of the second line segment: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		Class11 intersection = new Class11(x1, y1, x2, y2, x3, y3, x4, y4);  // якось так мало б бути? чи потрібно тут переписати клас?
		
		System.out.print("The intersection point is: " + );
	}
}
