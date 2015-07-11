package Loop;
/*(Monte Carlo simulation) A square is divided into four smaller regions as shown
below in (a). If you throw a dart into the square 1,000,000 times, what is the prob-
ability for a dart to fall into an odd-numbered region? Write a program to simulate
the process and display the result.
(Hint: Place the center of the square in the center of a coordinate system, as shown
in (b). Randomly generate a point in the square and count the number of times for
a point to fall into an odd-numbered region.)*/
public class Loop44 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 0; i < 1000000; i++) {
			int x = (int)Math.random() * 10;
			int y = (int)Math.random() * 10;
			
			if(x > 0 && y < 0 || x < 0 && y < 0)
				count++;
			else if(x==0);
		}
	}
}
