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
	// переробив, працює. але боюсь я не правильно зрозумів умову. з алгеброю я поки що не дуже
	// результат із наведеним прикладом у вправі 3.3 не співпадає.  ax + by = e  cx + dy = f взагалі використовуються?
	// -- Гугл на допомогу ))) http://www.webmath.ru/poleznoe/formules_5_4.php
	// -- я вже теж це все позабував
	// -- отже це система з двох рівнянь, яка тут розв'язується методом Крамера
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	Class11(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f; //-- тут було ще раз d замість f, тому фігово рахувало
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
	public double getD(){
		return this.d;
	}
	public double getE(){
		return this.e;
	}
	public double getF(){
		return this.f;
	}
	//-- це визначник матриці системи, якщо він = 0, система рівнянь не має розв'язку 
	public boolean isSolvable(){
		return a * d - b * c != 0;	//-- нащо ускладнювати)	
	}
	
	public double getX(){
		double x = (e * d - b * f) / (a * d - b * c);
		return x;
	}
	public double getY(){
		double y = (a * f - e * c) / (a * d - b * c);
		return y;
	}
//}

//class Class11Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a, b, c, d, e and f: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		double c1 = input.nextDouble();
		double d1 = input.nextDouble();
		double e1 = input.nextDouble();
		double f1 = input.nextDouble();
		
		Class11 linear = new Class11(a1, b1, c1, d1, e1, f1);
		if(!linear.isSolvable()) {// --порівняння з false зайве, просто інвертуєм значення, яке повертає isSolvable, за допомогою оператора !
			System.out.println("The equation has no solution");
		} else {
			System.out.println("X is " + linear.getX() + " and Y is " + linear.getY());
		}// в таких блоках ставимо фігурні дужки, навіть якщо все по одному рядку - такі загальноприйняті правила
		input.close();
	}	
		
}
