import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		int score = 0;
		int max = 0;
		String name = "";
		String maxName = "";
		String name2 = "";
		int max2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		int stud = input.nextInt();
		
		System.out.println("Enter name and score");
		for (int a = 0; a < stud; a++){
			name = input.next();
			score = input.nextInt();
			if (score > max){
				max2 = max;
				max = score;
				name2 = maxName;
				maxName = name;
				
			}
			
		}
		System.out.println(maxName + " " + name2);
	}	
}