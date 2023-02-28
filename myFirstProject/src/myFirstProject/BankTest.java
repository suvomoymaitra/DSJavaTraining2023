package myFirstProject;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount baObjRef1 = new BankAccount();
		BankAccount baObjRef2 = new BankAccount();
		baObjRef1.deposit(2147483647);
		baObjRef2.deposit(200);
		
		baObjRef1.withdraw();
		baObjRef1.withdraw();
		
		baObjRef1.fundTransfer();
		baObjRef1.fundTransfer();
		
	}

}

class BankAccount{
	
	int accountNumber;
	String accountHolder;
	float bankBalance;
	
	void withdraw() {
		System.out.println("Withdrawing....");
	}
	
	void deposit(float amount) {
		System.out.println("Depositing...." + amount);
	}
	
	void fundTransfer() {
		System.out.println("Transferring funds....");
	}
}
