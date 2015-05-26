/*(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side (note that 1 kilogram is 2.2
pounds and that 1 pound is 0.453 kilograms):*/

public class Loop5 {
	public static void main(String[] args) {
		
		final int kilograms = 200;
		double pound = 0;
		double kilo = 0;
		int x = 20;
		
		System.out.print("Kilograms     Pounds  |  ");
		System.out.print("Pounds     Kilograms\n");
		
		for (int i = 1; i <= kilograms; i+=2) {
			pound = i * 2.2;
			System.out.printf("%-10d %8.1f   |  ", i, pound);  // намагався зробити це через цикл у циклі. не вийшло. зробив ось так, хоча гадаю то не найкращий спосіб.
			                                                   // аналогічно зроблена й наступна задачка.
			kilo = x * 0.453;
			System.out.printf("%-9d %7.2f \n", x, kilo);
			x += 5;
		}
	}
}
