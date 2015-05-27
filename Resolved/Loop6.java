/*(Conversion from miles to kilometers) Write a program that displays the following
two tables side by side (note that 1 mile is 1.609 kilometers and that 1 kilometer is
.621 miles):*/
public class Loop6 {
	public static void main(String[] args) {
		final int maxmiles = 10;
		double mile = 0;
		double kilometer = 0;
		int x = 20;
		
		System.out.print("Miles     Kilometers  |  ");
		System.out.print("Kilometers     Miles\n");
		
		for (int i = 1; i <= maxmiles; i++) {
			kilometer = i * 1.609;
			System.out.printf("%-9d %-9.3f   |  ", i, kilometer);

			mile = x * 0.621;
			System.out.printf("%-12d   %-15.3f \n", x, mile);  // тут у мене є неспівпадіння в цифрах після коми у порівнянні з підручником. хоча ніби все правильно. 
			x += 5;
		}
	}

}
