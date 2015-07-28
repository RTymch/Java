package Method;
/*(The MyTriangle class) Create a class named MyTriangle that contains the
following two methods:
/** Return true if the sum of any two sides is
* greater than the third side. 
public static boolean isValid(
double side1, double side2, double side3)
/** Return the area of the triangle. 
public static double area(
double side1, double side2, double side3)
5.20
Write a test program that reads three sides for a triangle and computes the area if
the input is valid. Otherwise, it displays that the input is invalid. The formula for
computing the area of a triangle is given in Programming Exercise 2.15*/
import java.util.Scanner;
public class Method19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sides a, b and c: ");  // вводити через кому
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("The triangle area with sides " + side1 +", "+ side2 +" and "+ side3 + " is " + area( side1, side2, side3) );

	}
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1)
			return true;
		return false;
	}
	public static double area(double side1, double side2, double side3) {
		double p = (side1 + side2 + side3) / 2.0;
		double areaTriangle = 0;
		if (isValid(side1, side2, side3) == true){
			areaTriangle = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		}
		return areaTriangle;
	}
}
