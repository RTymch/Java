package Class_and_Object;
/*(The Rectangle class) Following the example of the Circle class in Section 8.2,
design a class named Rectangle to represent a rectangle. The class contains:

■  Two double data fields named width and height that specify the width and
   height of the rectangle. The default values are 1 for both width and height .
■  A no-arg constructor that creates a default rectangle.
■  A constructor that creates a rectangle with the specified width and height .
■  A method named getArea() that returns the area of this rectangle.
■  A method named getPerimeter() that returns the perimeter.

Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9 . Display the width, height, area,
and perimeter of each rectangle in this order. */

public class Class01 /*Rectangle*/ {
	
	// data fields
	double width = 1;
	double height = 1;
	
	Class01() {	
	}
	
	Class01(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	//methods
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return (height + width) * 2;
	}
	
}
