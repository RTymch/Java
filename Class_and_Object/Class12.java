package Class_and_Object;
import java.util.Scanner;

/**Exercise 3.3 for sample runs.
(Geometry: intersection) Suppose two line segments intersect. The two endpoints
for the first line segment are ( x1 , y1 ) and ( x2 , y2 ) and for the second line segment
are ( x3 , y3 ) and ( x4 , y4 ). Write a program that prompts the user to enter these four
endpoints and displays the intersecting point. (Hint: Use the LinearEquation
class in Exercise 8.11.)*/
public class Class12 {
	  //ні, я однаково цілковито не розумію як можна знайти точку перетину двох прямих використовуючи метод
	//котрий... що він там до речі шукає? 
	//-- точку перетину двох прямих
	//-- спочатку треба з кожної пари точок знайти рівняння прямих, що проходять через них
	//--а тоді точку перетину цих прямих
	
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
		
		Class11 intersection1 = new Class11();  
		Class11 intersection2 = new Class11();
		Class11 intersection3 = new Class11();
		
		System.out.print("The intersection point is: " + );
	}
}
