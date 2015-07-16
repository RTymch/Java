package Class_and_Object;
import java.util.Scanner;
/**(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row , column , and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)

The return value is an instance of Location . Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array.*/
public class Class13 /*Location*/ {   // ну от, екліпс нічого не підсвічує, але нічого й не працює))
									// і загалом багато чого робив методом тика. нема розуміння повного що і коли треба.
	public int row;					//чому тут паблік? тут не потрібно "захищати від несанкціонованих змін"?
	public int column;
	public static double maxValue;   // екліпс пише що потрібно зробити статік. чому?
	public static double a[][];   // в умові не сказано про створення матриці. чи можна/потрібно ствворювати її тут?
								// чи потрібно тут також get методи для кожного параметру якщо вони є паблік?
	
	Class13(){}        // порожній конструктор потрібно створювати завжди?
	
	Class13(int row, int column, int maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
	public static double getMaxValue(){        //  я впихнув сюди і максимальне значення і індекси
		maxValue = a[0][0];						// при спробі запустити екліпс показує що помилка в цьому рядку. яка?
		int indexRow = 0;
		int indexColumn = 0;					// а от як повернути значення індексів? інший метод? як?
		for(int row = 0; row < a.length; row++){
			for(int column = 0; column < a[row].length; column++){
				if(maxValue < a[row][column]){
					maxValue = a[row][column];
					indexRow = row;
					indexColumn = column;
				}
			}
		}
		return maxValue;
	}
	
	//public static Location locateLargest(double[][] a);   // чому тут Location locateLargest
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row1 = input.nextInt();
		int column1 = input.nextInt();
		double[][]a = new double [row1][column1];
		
		System.out.println("Enter the array: ");
		for(int row = 0; row < a.length; row++){
			for(int column = 0; column < a[row].length; column++){
				a[row][column] = input.nextDouble();
			}
		}
		
	//	Class13 matrix = new Class13(row1, column1);   
		
	//	System.out.print("The  largest element is " + matrix.getMaxValue() +
	//			 ", location is" );
	}
}
