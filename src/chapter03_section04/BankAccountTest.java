package chapter03_section04;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDeposit() {
		BankAccount harrysChecking = new BankAccount();
		harrysChecking.deposit(2000);
		assertEquals(2000.0, harrysChecking.getBalance(), 0.0);
		//What it should be, what it is, error margin
	}
	
	@Test
	public void testWithdraw() {
		BankAccount harrysChecking = new BankAccount(2000);
		harrysChecking.withdraw(500);
		assertEquals(1400.0, harrysChecking.getBalance(), 0.0);
		//What it should be, what it is, error margin
	}
}






