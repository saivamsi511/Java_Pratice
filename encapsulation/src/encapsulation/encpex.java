package encapsulation;

class Bank {
	private double balance = 10000;

	public double getBalance() {
		System.out.println(balance);
		return balance;
	}
	
	public void withdraw(double amount) {
		if(balance > amount) {
			balance -= amount;
			System.out.println("amount withdrawn " + amount + " successfully");
		}else {
			System.out.println("Not possible because amount is not there in your account");
		}
	}
	public void setBalance(double amount) {
		if(balance < amount) {
			balance += amount;
			System.out.println(balance);
		}else {
			System.out.println("Not possible");		}
	}
	
}
public class encpex {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.getBalance();
		bank.setBalance(12000);
		bank.withdraw(500);
		bank.withdraw(10000000.000);
		bank.setBalance(-222);
	}
}
