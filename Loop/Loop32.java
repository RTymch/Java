package Loop;
/*(Game: lottery) Revise Listing 3.9, Lottery.java, to generate a lottery of a two-
digit number. The two digits in the number are distinct. (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different from
the first digit.)*/

public class Loop32 {
	public static void main(String[] args) {
		
		int lottery1 = (int)(Math.random() * 10);
		int lottery2 = (int)(Math.random() * 10);
		
		while(true) {
			if (lottery1 == lottery2)
				lottery2 = (int)(Math.random() * 10);
			else
				break;
		}
		
		System.out.print(lottery1 +""+ lottery2);
	}
}
