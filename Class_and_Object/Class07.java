package Class_and_Object;

import java.util.Date;

/**(The Account class) Design a class named Account that contains:

■ A private int data field named id for the account (default 0 ).
■ A private double data field named balance for the account (default 0 ).
■ A private double data field named annualInterestRate that stores the
  current interest rate (default 0 ). Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
  account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
___________________________________________________________________________________
■ The accessor and mutator methods for id , balance , and
  annualInterestRate . 
■ The accessor method for dateCreated
■ A method named getMonthlyInterestRate() that returns the monthly
  interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
  account.
■ A method named deposit that deposits a specified amount to the account.

Draw the UML diagram for the class and then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate. 
Monthly interest is balance * monthlyInterestRate . monthlyInterestRate is
annualInterestRate / 12 .
 Note that annualInterestRate is a percentage, e.g.,like 4.5%. You need to divide it by 100.)
##############################################################################
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.*/

public class Class07 /*Account*/{     // ну по перше сама умова цієї задачі не надто мені зрозуміла. і тут таких повно
				     // якщо після прочитання умови ти також нічого не зрозумів, то можна забити і
	private int id = 0;	    //  перейти сюди https://github.com/SergiyL/Java/blob/master/Class_and_Object/Class08.java
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;     // не певен чи правильно зрозумів умову "private Date data field"
	
	Class07(){}
	
	Class07(int id, double balance){    // конструктор за зразком поданим в підручнику. але екліпс показує помилку
		id = newId;      
		balance = newBalance;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int newId){
		id = newId;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate / 100;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(){
		double monthlyInterest = balance * monthlyInterestRate();  
		return monthlyInterest; 
	}
	public double withdraw(){
		balance - getMonthlyInterest() // якщо правильно зрозумів вимогу до функції. мінус підсвічено як недопустимий оператор
	}
	public double deposit(){
		balance + getMonthlyInterest() // аналогічно
	}
}

class Test07Class{
	
	public static void main(String[] args){
		
		Class07 account= new Class07();
		account.id = 1122;
		account.balance = 20000;
		account.annualInterestRate = 4.5;
		
		// Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000. 
		// тут взагалі нічого не ясно.
	}
}
