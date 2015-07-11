package Loop;
/*(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.*/
public class Loop40 {
	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		for (int i = 0; i < 1000000; i++){
			int flip = (int)(Math.random() * 2);
			if (flip == 0)
				head++;
			else
				tail++;
		}
		System.out.println(head);
		System.out.println(tail);
	}
}
