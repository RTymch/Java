/*(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:*/

public class Loop18 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 6; i++){
			for (int x = 1; x <= 6; x++) {
				System.out.println(i + ((x == i)? "\n" : " "));  // тут я також не знаю як. я в тих багаторівневих циклах плутаюсь.
				
			}
		}
	}
}
