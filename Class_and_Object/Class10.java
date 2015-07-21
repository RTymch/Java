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

public class Class10 /*QuadraticEquation*/ {   // переробив, запрацювало!!! 
						// але є питання. у нас відсутні setMethods(). чому тоді приватні
	private double a;			// змінюються?
	private double b;          // -- private - це модифікатор доступу, який встановлює видимість змінної/методу лише в межах даного класу.
	private double c;          // -- тому в даному класі ти з своїми private змінними робиш що завгодно 
	
	Class10(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA(){
		return this.a;
	}
	public double getB(){
		return this.b;
	}
	public double getC(){
		return this.c;
	}
	public double getDiscriminant(){
		double discriminant = b*b - 4*a*c;
		return discriminant;
	}
	public double getRoot1(){
		if (getDiscriminant() >= 0)
			return (-b + Math.sqrt(getDiscriminant()));
		else 
			return 0;
	}
	public double getRoot2(){
		if (b*b - 4*a*c >= 0)
			return (-b - Math.sqrt(getDiscriminant()));
		else
			return 0;
	}
//}

//class Class10Test{
	public static void main(String[] args){           //чи правильна ця частина? спочатку саме з цим не міг дати ради
		Scanner input = new Scanner(System.in);       // -- ніби все ок
		System.out.println("Enter value for a, b and c: ");
		double newA = input.nextDouble();
		double newB = input.nextDouble();
		double newC = input.nextDouble();
		
		Class10 equation = new Class10(newA, newB, newC);
		if(equation.getDiscriminant() > 0)
			System.out.println("Discriminant is positive. Root1 = " + equation.getRoot1() 
					+" and Root2 = "+ equation.getRoot2());
		else if(equation.getDiscriminant() == 0)
			System.out.println("Discriminant is equal to 0. Root1 = " + equation.getRoot1());
		else
			System.out.println("The equation has no roots.");
		input.close();//Eclipse же просив :)
	}
}
