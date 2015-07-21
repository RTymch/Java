package Class_and_Object;
/**(The Fan class) Design a class named Fan to represent a fan. The class contains:

■ Three constants named SLOW , MEDIUM , and FAST with the values 1 , 2 , and 3 to
denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the
   default is SLOW ).
■ A private boolean data field named on that specifies whether the fan is on (the
   default is false ).
■ A private double data field named radius that specifies the radius of the fan
   (the default is 5 ).
■ A string data field named color that specifies the color of the fan (the default
   is blue ).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.

■ A method named toString() that returns a string description for the fan. If      
   the fan is on, the method returns the fan speed, color, and radius in one com-
   bined string. If the fan is not on, the method returns the fan color and radius
   along with the string “fan is off” in one combined string.

Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10 , color
yellow , and turn it on to the first object. Assign medium speed, radius 5 , color
blue , and turn it off to the second object. Display the objects by invoking their
toString method.
*/
public class Class08 /*Fan*/ { 

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//Class08(){}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
	
	public boolean isOn(){
		return on;
	}
	public void setOn(boolean newOn){
		on = newOn;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	
	public String toString(){//--тут ми переписуємо дефолтний метод toString, який є в кожному об'єкті    // не розумію як зробити return однією стрічкою.  
		if (on = true){                                                  // і чи я взагалі правильно зрозумів з приводу toString()
			return "Speed: " + speed + ", Color: " + color + ", Radius:" + radius;	//-- дивись, в тебе метод має повертати String. Тобто тут ти будуєш стрічку і повертаєш її					
		}
		else{
			return "Speed: " + speed + ", Radius:" + radius + ", fan is off";
		}
	}

	class TestClass08{                          
		public void main(String[] args){  //тут не вдалося зробити public static. екліпс підкреслив. чому? 
			                            //-- тобі не треба створювати ще один клас для цього. Просто додаєш такий метод в основному класі. 
			Class08 fan1 = new Class08();   // оскільки у нас є тільки один конструктор без аргументів
			fan1.speed = FAST;		// то чи буде правильним саме такий запис?
			fan1.radius = 10;       // -- так, буде. Можеш взагалі конструктора не писати, все одно буде дефолтний  
			fan1.color = "yellow";
			fan1.on = true;
			System.out.println(toString());// --а де об'єкт? чий метод toString викликаєш? 
			
			Class08 fan2 = new Class08();
			fan2.speed = MEDIUM;
			fan2.radius = 5;
			fan2.color = "blue";
			fan2.on = false;
			System.out.println(toString());// --а де об'єкт? чий метод toString викликаєш?
		}
	}
	
	public static void main(String[] args){
		//Here you go
		
	}
}
