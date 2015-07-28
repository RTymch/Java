package Method;
/*(Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int
numberPerLine)
This method prints the characters between ch1 and ch2 with the specified num-
bers per line. Write a test program that prints ten characters per line from 1 to Z .
Characters are separated by exactly one space*/
public class Method12 {
	public static void main(String[] args) {
		char ch1 = 1;
		char ch2 = 'Z';
		int numberPerLine = 10;
		
		printChars( ch1, ch2, numberPerLine);
	}
	public static void printChars(char ch1, char ch2, int
			numberPerLine) {
		while (ch1 <= ch2) {
			System.out.print((char)ch1 + ((ch1 % numberPerLine != 0) ? " " : "\n"));
			ch1++;
		}
	}
}
