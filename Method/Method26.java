package Method;
/*(Palindromic prime) A palindromic prime is a prime number and also palin-
dromic. For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Dis-
play 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
*/
public class Method26 {
	public static void main(String[] args) {
		printPaliPrime (100);
		
	}
	
	public static int palindrome(int count) {   // здійснення реверсу числа. за аргумент взяв count з останнього методу
		int x = 0;
		int num = 1;
		int reverse = 0;
		while (num <= count) {
			x = x * 10 + (num % 10);
			reverse = num /10;
			num++;	
		}	
		return reverse;
	}
	
	public static boolean isPalindrome(int num) {   // перевірка на паліндромність
		if (palindrome(num) == num)
			return false;
		return true;
	}
	
	public static boolean prime(int num) {     //  перевірка на простоту
		if(isPalindrome(num) == true){
			for(int i = 2; i < palindrome(num); i++) {
				if(palindrome(num) % i == 0)
					return false;
			}
		}
		return true;
	}
	
	public static int printPaliPrime (int number) {  // що має бути аргументом palindrome() і prime(). number? задати printPaliPrime 
		int count = 0;                               // ще один аргумент num? здається окрім цих двох моментів розібрався з усім
		while (count < number) {
			count++;
			if (prime(number) == true)
				System.out.print(palindrome(number) + ((count % 10 == 0) ? "\n" : " "));
			
		}
		return count;
	}
}
