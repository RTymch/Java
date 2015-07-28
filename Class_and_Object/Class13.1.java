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
public class Class13 /*Location*/ {  //хм... твої відповіді на мої питання прояснення мені не принесли, швидше сворили
									//ще більше питань(
							// -- ну і де питання?
	public int row;					//це поточний недоваріант. перечитав ще раз умову і бачу що просто був неуважним. 
	public int column;
	public static double maxValue;   // 
							
	
	Class13(int row, int column, int maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
/**	public double getMaxValue(){          
		maxValue = a[0][0];				
		int indexRow = 0;
		int indexColumn = 0;			
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
	} */
	
	
	
	public static Class13/*Location*/ locateLargest(double[][] a) { // ну для початку мені є не зрозумілою назва цього методу
		maxValue = a[0][0];												// чому тут використовується назва класу Location?
									//-- Ну завдання таке. Треба знайти найбільший елемент двовимірного масиву
		for(int row = 0; row < a.length; row++){			//"і в саме в ньому статичний метод locateLargest, який і буде
			for(int column = 0; column < a[row].length; column++){ //отримувати на вхід масив локацій, знаходити максимальну 
				if(maxValue < a[row][column]){			//і з того створювати об'єкт класу Location, а потім його повертати"
					maxValue = a[row][column];			//не те щоб пояснення були не зрозумілі, просто я щось їх не розумію)
					                                                //--назва класу має завжди відповідати його призначенню
				}										// де і як ми шукаємо індекси я вже цілковито не розумію
											//-- в тебе два вкладені цикли. Ти проходишся по кожному рядку в зовнішньому циклі, і по кожному стовпці у внутрішньому циклі
											//-- це як обійти всі квартири в будинку - спочатку 1й під'їзд і там всі квартири по черзі, потім 2й і там всі квартири, і так далі
			}								//-- Спочатку ти припускаєш, шо перший елемент найбільший, і в кожному проході порівнюєш його з поточним, водночас, до речі, треба записувати його row і column,
											//-- а то загубиш))
		}
		return maxValue; //???   
	}   
	
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
		
		//Class13 matrix = new Class13(row1, column1);   
		
	//	System.out.print("The  largest element is " + matrix.getMaxValue() +
		//		 ", location is" );
	}
}
