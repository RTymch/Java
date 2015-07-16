package Class_and_Object;

import java.util.Date;

/**(Stopwatch) Design a class named StopWatch . The class contains:

■ Private data fields startTime and endTime with get methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.

Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using selec-
tion sort.*/
public class Class14 /*Stopwatch*/ {
										//уявлення не маю чи правильно зроблено, але якийсь результат видає))
	private long startTime;  
	private long endTime;
	
	Class14(){}
	
	public long getStartTime(){
		return this.startTime;
	}
	public long getEndTime(){
		return this.endTime;
	}
	
	public long start(){           
		startTime = System.currentTimeMillis();  
		return startTime;
	}
	
	public long stop(){
		endTime = System.currentTimeMillis();  
		return endTime;
	}
	
	public long getElapsedTime(){
		return endTime - startTime;
	}
	
	public static void main(String[] args) {
		Class14 timer = new Class14();
		final int SIZE = 100000;         
		double[] sortList = new double [SIZE];     // "наповнення" масиву
		for(int i = 0; i < sortList.length; i++ ){
			sortList[i] = Math.random();
		}
		timer.start();
		for (int i = 0; i < sortList.length - 1; i++){    //сортування. скопіював з підручника. не надто розумію код.
			double currentMin = sortList[i];
			int currentMinIndex = i;
			
			
			for(int j = i + 1; j < sortList.length; j++){
				if(currentMin > sortList[j]){
					currentMin = sortList[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i){
				sortList[currentMinIndex] = sortList[i];
				sortList[i] = currentMin;
			}
		}
		timer.stop();
		System.out.println(timer.getElapsedTime()/1000.0 + " секунд");
	}
}
