package Loop;
/*(Financial application: find the sales amount) You have just started a sales job in
a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the com-
mission rate.
Your goal is to earn $30,000 a year. Write a program that finds out the minimum
number of sales you have to generate in order to make $30,000.*/
public class Loop39 {
	public static void main(String[] args) {
		
		int sale = 5000;
		double commision = 8;
		double salary =  (sale * 1.08 - sale);
		int count = 0;
		int goal = 30000;
		int x = 0;
		System.out.println(salary);
		
		while(true) {
			count++;
			x += salary;
			if(x >= goal)
				break;
		}
		System.out.print(count);
	}
}
