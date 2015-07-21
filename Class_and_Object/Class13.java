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
									//-- public для класу означає, що ти можеш його бачити за межами пакету.
	                               //-- для захисту від змін існують модифікатори доступу для полів і методів.
	public int column;              
	public double maxValue;   // екліпс пише що потрібно зробити статік. чому?
	//-- бо ти в статичному методі getMaxValue намагаєшся звернутися до поля об'єкта класу, а об'єкта-то нема ще)).
	//-- статичний метод/поле класу належить самому класу, до нього можна доступитися навіть якщо об'єкт класу не створений
	//-- нестатичні методи/поля належать об'єкту класу, тобто вони створюються при виклику конструктора класу.
	//-- глянь тут http://www.cyberforum.ru/java/thread182084.html
	public static double a[][];   // в умові не сказано про створення матриці. чи можна/потрібно ствворювати її тут?
								// чи потрібно тут також get методи для кожного параметру якщо вони є паблік?
	                           //--не обов'язково, але знову-таки - це суперечить принципам ООП (інкапсуляція)
	
	Class13(){}        // порожній конструктор потрібно створювати завжди?
	//--тут не треба, пізніше будуть ситуації де ти побачиш для чого таке роблять
	
	Class13(int row, int column, int maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
	public static double getMaxValue(){        //  я впихнув сюди і максимальне значення і індекси
		maxValue = a[0][0];						// при спробі запустити екліпс показує що помилка в цьому рядку. яка?
		//-- ти намагаєшся з метода класу (статичного) присвоїти значення змінній об'єкта. А ніззя.
		//-- зазвичай статичні методи - це якісь утилітарні речі, для виконання яких не потрібно створення цілого об'єкта класу
		int indexRow = 0;
		int indexColumn = 0;					// а от як повернути значення індексів? інший метод? як?
	    //--ти маєш створити внутрішній клас Location, який має два поля x(row) і y(column)
		//--і в саме в ньому статичний метод locateLargest, який і буде отримувати на вхід масив локацій, знаходити максимальну і з того створювати об'єкт класу Location, а потім його повертати
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
