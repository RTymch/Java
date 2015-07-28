package Method;
/*(Use trigonometric methods) Print the following table to display the sin value and
cos value of degrees from 0 to 360 with increments of 10 degrees. Round the
value to keep four digits after the decimal point.*/
public class Method20 {
	public static void main(String[] args) {
		System.out.println("Degree   Sin      Cos");
		sincos(360);
	}
	public static void sincos(int degree) {
		
		double sin = 0;
		double cos = 0;
		
		for(int x = 0; x <= degree; x+=10) {
			sin = Math.sin(Math.toRadians(x));
			cos = Math.cos(Math.toRadians(x));
			
			System.out.printf("%2d \t %1.4f  %1.4f\n", x, sin, cos);
		}
		
	}

}
