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

public class Class07 /*Account*/{     

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	Class07(){}
	
	Class07(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate / 100;
	}
	
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = this.annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(){
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest; 
	}
	public double withdraw(int amount){
		return balance -= amount;
	}
	public double deposit(int amount){
		return balance += amount;
	}
	
	public static void main(String[] args){
		
		Class07 account= new Class07(1122, 20000, 4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account.getBalance()+" "+ account.getMonthlyInterest()+" "+account.getDateCreated());
		
	}
}
/**довго не мудруючи переписав за твоїм зразком. тепер наступні питання:
 * 
1. маємо тепер один спільний клас. чому? чи не є сенс створення класів саме в тому,
щоб мати до них доступ з інших класів. ну типу як з функцією. або я все не так розумію.
2. коли переписав код залишивши розподіл на два класи то не працювало нічого. тобто println() нічого не писав. чому?
3. account.getDateCreated() видає null. чому і що мав би? і як зробити щоб була, як я розумію, поточна дата.

в підсумку я умову до кінця так і не зрозумів що там вони хотіли, але головне що хоч щось працює))*/
