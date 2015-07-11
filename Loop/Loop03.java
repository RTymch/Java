package Loop;
//(Conversion from kilograms to pounds
/*Kilograms    Pounds
1                2.2
3                6.6
... 

197            433.4
199            437.8   */

public class Loop3 {
	public static void main(String[] args) {
		final int kilo = 200;
		double pound = 0;
		
		System.out.println("Kilograms     Pounds");
		
		for(int i = 1; i <= kilo; i+=2) {
				pound = i * 2.2;
				System.out.printf("%-10d %8.1f \n", i, pound); // з цим рядком довелося трохи поморочитись. методом тика))
		}
	}
}
