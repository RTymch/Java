package Loop;
/*(Financial application: compute future tuition) Suppose that the tuition for a uni-
versity is $10,000 this year and increases 5% every year. Write a program that
computes the tuition in ten years and the total cost of four years’ worth of tuition
starting ten years from now.*/

// я не зовсім зрозумів умову. вимагається обрахувати суму за всі 10 років і окремо за 4. перші 4? середня за 4?

public class Loop7 {
	public static void main(String[] args) {
		double tuition = 10000;
		final int years = 10;
		final int fourYears = 4;
		
		for (int i = 0; i < years; i++) {
			tuition += tuition * 1.05;
		}
		
		
		System.out.printf("Tuition for 10 years is $%6.2f", tuition); // і загалом сума яка вийшла виглядає злегка завеликою
		

	}
}
