package Method;
/*(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:

d = radius * arccos(sin(x 1 ) * sin(x 2 ) + cos(x 1 ) * cos(x 2 ) * cos(y 1 - y 2 ))

Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for North and West.
Use negative to indicate South and East degrees*/
import java.util.Scanner;
public class Method21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("The distance between two points is " + distance(x1, x2, y1, y2) + " km");
	}
	public static double distance(double x1, double x2, double y1, double y2) {
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(Math.toRadians(x1))* Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
		return d;
	}
}
