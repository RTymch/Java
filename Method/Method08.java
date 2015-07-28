package Method;
/*(Conversions between Celsius and Fahrenheit) Write a class that contains the fol-
lowing two methods:
/** Convert from Celsius to Fahrenheit 
public static double celsiusToFahrenheit(double celsius)
/** Convert from Fahrenheit to Celsius 
public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit – 32)
Write a test program that invokes these methods to display the following tables:*/

public class Method08 {
	public static void main(String[] args) {
		System.out.println("Celsius \t Fahrenheit \t |\t Fahrenheit \t Celcius");
		double celsius = 40.0;
		double fahrenheit = 120.0;
		
		for (int x = 0;x < 9; x++) {
			celsius --;
			fahrenheit -= 10;
			
			System.out.printf("%-3.0f  \t\t  %-3.2f\t | ", celsius ,celsiusToFahrenheit(celsius));  // показує помилку в цьому рядку.
			                                                                           // не розумію що не так. подібні робив вже.
			System.out.printf("\t %-3.0f \t\t %7.2f \n", fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		double inFahrenheit = (9.0 / 5) * (celsius + 32);
		return inFahrenheit;
		
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double inCelsius = (5.0 / 9) * (fahrenheit - 32);
		return inCelsius;
		}
		
		
	
}
