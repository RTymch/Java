package Class_and_Object;

public class Class01Test {

	public static void main(String[] args) {
		//create objects
		Class01 rectangle1 = new Class01();
		rectangle1.width = 4;
		rectangle1.height = 40;
		System.out.println("The width of rectangle 1 is " + rectangle1.width + ", height is " + rectangle1.height + 
				", area is " + rectangle1.getArea() + " and perimeter is " + rectangle1.getPerimeter());
		
		Class01 rectangle2 = new Class01();
		rectangle2.width = 3.5;
		rectangle2.height = 35.9;
		System.out.println("The width of rectangle 2 is " + rectangle2.width + ", height is " + rectangle2.height + 
				", area is " + rectangle2.getArea() + " and perimeter is " + rectangle2.getPerimeter());
	}

}
