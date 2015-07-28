package Method;
/*(Financial application: print a tax table) Listing 3.6 gives a program to compute
tax. Write a method for computing tax using the following header:
public static double computetax(int status, double taxableIncome)

Use this method to write a program that prints a tax table for taxable income from
$50,000 to $60,000 with intervals of $50 for all the following statuses */
public class Method15 {
	public static void main(String[] args) {
		System.out.println("Taxable Income   Single   Married Joint   Married Separate   Head of House");
		computetax(0, 50000);
	}
	public static double computetax(int status, double taxableIncome) {
		double tax0 = 0;
		double tax1 = 0;
		double tax2 = 0;
		double tax3 = 0;
		
		for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {
		
			for(status = 0; status < 4; status++) {
				if (status == 0) { 
					tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 +
							(taxableIncome - 33950) * 0.25;
				}
				else if (status == 1) { 
					tax1 = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
				}
				else if (status == 2) { 
					tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 +
							(taxableIncome - 33950) * 0.25;
				}
				else if (status == 3) { 
					tax3 = 11950 * 0.10 + (45550 - 11950) * 0.15 +
							(taxableIncome - 45550) * 0.25;
				}
				
			}
			System.out.printf("%5.0f \t\t %5.0f \t  %5.0f   \t  %5.0f \t\t  %5.0f \n", taxableIncome, tax0, tax1, tax2, tax3);
			
		}
		return tax0;
	}
}
