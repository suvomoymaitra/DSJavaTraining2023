
public class BankingTest {

	public static void main(String[] args) {
		
	}

}

class Teller extends Thread{
	String tellerName;
}


class SavingsAccount{
	long accountNumber;
	String accountHolder;
	double accountBalance;
	public SavingsAccount(long accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	private void setBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	private double getBalance() {
		return this.accountBalance;
	}
	
	void depositMoney(double val,Teller teller) {
		System.out.println(teller.tellerName + " is checking the Account Balance....");
		double currBalance = getBalance();
		
		System.out.println("Account balance is : " + currBalance);
		System.out.println(teller.tellerName + " is using their mobile....");
		System.out.println(teller.tellerName + " is using their mobile....");
		System.out.println(teller.tellerName + " is using their mobile....");
		System.out.println(teller.tellerName + " is using their mobile....");
		
		
		
		setBalance(currBalance + val);
		
	}
	
}