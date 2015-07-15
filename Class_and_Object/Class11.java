package Class_and_Object;

import java.util.Scanner;

/**(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
                x = (ed - bf) / (ad - bc)  y = (af - ec) / (ad - bc)
cx + dy = f 

The class contains:
■ Private data fields a , b , c , d , e , and f .
■ A constructor with the arguments for a , b , c , d , e , and f .
■ Six get methods for a , b , c , d , e , and f .
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.


Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a , b , c , d , e , and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” See Programming
Exercise 3.3 for sample runs.*/
public class Class11 /*LinearEquation*/{
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	Class11(double a, double b, double c, double d, double e, double f){
		
	}
	
	public double getA(){
		return a;
	} 
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	
	public boolean isSolvable(){
		if(a * d - b * c != 0)
			return true;
		else 
			return false;		
	}
	
	public double getX(){
		double x = (e * d - b * f) / (a * d - b * c);
		return x;
	}
	public double getY(){
		double y = (a * f - e * c) / (a * d - b * c);
		return y;
	}
}

class Class11Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a, b, c, d, e and f: ");
}
