
package Class_and_Object;
/**(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000 , 100000 , 1000000 , 10000000 , 100000000 , 1000000000 ,
10000000000 , and 100000000000 , and displays the date and time using the
toString() method, respectively.*/
public class Class03 /**Date*/ {
	
	public static void main(String[] args) {
		
		long time = 10000;
		java.util.Date date = new java.util.Date(time) ;
		while(time <= 100000000000.0){
			time = time * 10;
			date = new java.util.Date(time);
			System.out.println(date.getTime() + " miliseconds");
			System.out.println(date.toString());
			System.out.println("");
		}
	}
}