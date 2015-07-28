package Method;
/*(Geometry: display angles) Write a program that prompts the user to enter three
points of a triangle and displays the angles in degrees. Round the value to keep
two digits after the decimal point. The formula to compute angles A, B, and C are
as follows:
A = arccos((a * a - b * b - c * c) / (-2 * b * c))
B = arccos((b * b - a * a - c * c) / (-2 * a * c))
C = arccos((c * c - b * b - a * a) / (-2 * a * b))*/

import java.util.Scanner;
public class Method23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		points(x1, y1, x2, y2, x3, y3);
	}
	public static double points(double x1, double y1, double x2,
			double y2, double x3, double y3) {
		double A = Math.acos(Math.toRadians(x1 * y1 - x2 * y2 - x3 * y3) / Math.toRadians(-2 * x2 * x3));
		double B = Math.acos(Math.toRadians(x2 * y2 - x1 * y1 - x3 * y3) / Math.toRadians(-2 * x1 * x3));
		double C = Math.acos(Math.toRadians(x3 * y3 - x1 * y1 - x2 * y2) / Math.toRadians(-2 * x1 * x2));
		
		System.out.print("Three angles are: " + A + " " + B + " " + C);
		return A;
	}
}
