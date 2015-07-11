package Loop;
/*(Perfect number) A positive integer is called a perfect number if it is equal to the
sum of all of its positive divisors, excluding itself. For example, 6 is the first per-
fect number because 6 = 3 + 2 + 1 . The next is 28 = 14 + 7 + 4 + 2 +
1 . There are four perfect numbers less than 10,000. Write a program to find all
these four numbers.*/
public class Loop33 {
	public static void main(String[] args) {
		int sum = 0;
		for(int x = 3; x < 10000; x++) {
			for(int i = 1; i < x; i++){
				if(x % i == 0)
					sum += i;
			}
			if(x == sum)
				System.out.println(x);
		}
	}
}
