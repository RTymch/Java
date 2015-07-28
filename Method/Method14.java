package Method;
/*(Estimate p ) p can be computed using the following series
 m(i) = 4*(1 - 1/3 + 1/4 - 1/7 + 1/9 - 1/11 + ... + ((-1)**(i+1)/(2*i)-1)
 
 */
public class Method14 {
	public static void main(String[] args) {
		System.out.println("i \t m(i)");
		m(1000);
	}
	public static double m(int max_i) {
		int count = 1;
		double sum = 0;
		double d = 1;
		for(int i = 1; i <= max_i; i+=100) {
			count ++;
			if(count % 2 == 0)
				sum += 1/(d += 2);
			else
				sum -= 1/(d += 2);
			System.out.printf("%-3d   %3f\n",i, 4*(sum + (Math.pow(-1, i+1))/(2*i-1))); // формула не правильна
		}
		return sum;
		
	}
}
