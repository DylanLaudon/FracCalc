package chapter09_special_topic_03;

public class AccountTester {

	public static void main(String[] args) {
		Account anAccount; //OK
//		anAccount = new Account(); Error-Account is abstract
		anAccount = new SavingsAccount(); //OK
		anAccount = null; //OK
	}
}