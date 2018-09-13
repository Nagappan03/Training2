import java.util.Scanner;

public class Account {
	
	static double balance;
	static double amount;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		System.out.println("Enter the amount you want to deposit");
		Scanner s = new Scanner(System.in);
		amount = s.nextDouble();
		balance = balance + amount;
		System.out.println("Available balance is : "+balance);
	}
	
	public void withdraw(double amount) {
		System.out.println("Enter the amount you want to withdraw");
		Scanner s = new Scanner(System.in);
		amount = s.nextDouble();
		if(balance > amount) {
		balance = balance - amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
		System.out.println("Available balance is : "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(10000);
		System.out.println("Available balance is : "+balance);
		a.getBalance();
		a.deposit(amount);
		a.withdraw(amount);
	}

}
