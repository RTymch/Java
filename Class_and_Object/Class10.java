package Class_and_Object;
/**(Algebra: quadratic equations) Design a class named QuadraticEquation for a
quadratic equation ax² + bx + x = 0. The class contains:

■ Private data fields a , b , and c that represent three coefficients.
■ A constructor for the arguments for a , b , and c .
■ Three get methods for a , b , and c .
■ A method named getDiscriminant() that returns the discriminant, which is
   b² - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation

r1 = (-b + sqrt(b² - 4ac)) / 2a  and r2 = (-b - sqrt(b² - 4ac)) 

These methods are useful only if the discriminant is nonnegative. Let these meth-
ods return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.*/
import java.util.Scanner;

public class Class10 /*QuadraticEquation*/ {
	
	private double a;
	private double b;
	private double c;
	
	Class10(double a, double b, double c){
		
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
	public double getDiscriminant(){
		return b*b - 4*a*c;
	}
	public double getRoot1(){
		if (getDiscriminant() >= 0)
			return (-b + Math.sqrt(getDiscriminant()));
		else 
			return 0;
	}double a, double b, double c
	public double getRoot2(){
		if (b*b - 4*a*c >= 0)
			return (-b - Math.sqrt(getDiscriminant()));
		else
			return 0;
	}
}

class Class10Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a, b and c: ");
		double newA = input.nextDouble();
		double newB = input.nextDouble();
		double newC = input.nextDouble();
		
		Class10 equation = new Class10(newA, newB, newC);
		equation.a = newA;
		equation.b = newB;
		equation.c = newC;
	}
}
