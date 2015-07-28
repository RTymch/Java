package Method;
/*(Conversions between feet and meters) Write a class that contains the following
two methods:
/** Convert from feet to meters
 public static double footToMeter(double foot)
 public static double meterToFoot(double meter)
The formula for the conversion is:
meter = 0.305 * foot
foot = 3.279 * meter */

public class Method09 {
	public static void main(String[] args) {
		
		System.out.println("Feet  \t Meters \t |\t Meters \t Feet");
		System.out.println("___________________________________________________");
		double foot = 1.0;
		double meter = 20.0;
		
		for (int x = 0; x < 10; x++) {
			
			System.out.printf("%-3.0f  \t\t  %-3.3f\t | ", foot ,footToMeter(foot));
			System.out.printf("\t %-3.0f \t\t %7.3f \n", meter, meterToFoot(meter));
			
			foot++;
			meter += 5;
		}
	}
	public static double footToMeter(double foot) {
		double inMeters = 0.305 * foot;
		return inMeters;
	}
	public static double meterToFoot(double meter) {
		double inFeets = 3.279 * meter;
		return inFeets;
	}

}
