package chapter03_section04;

public class BankAccountTester2 {
	
	
	public static void main(String[] args) {
		BankAccount bobsChecking = new BankAccount();
		bobsChecking.deposit(1000);
		bobsChecking.withdraw(500);
		bobsChecking.withdraw(400);
		System.out.println("Actual: " + bobsChecking.getBalance());
		System.out.println("Expected: 100.0");
	}

}
