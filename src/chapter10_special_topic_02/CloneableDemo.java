package chapter10_special_topic_02;

public class CloneableDemo {

	public static void main(String[] args) {
		
		Customer harry = new Customer("Harry", 123.59);
		BankAccount sallyChecking = new BankAccount(123.59);

		if(harry.getBalance() == sallyChecking.getBalance()) {
			System.out.println("Harry and Sally have the same balance!");
		}
		
		Customer harrysWidow = (Customer) harry.clone();
		if (harry.getBalance() == harrysWidow.getBalance()){
			System.out.println("Harry's acount and Harry's Widow's account have the same balance!");
		}
	}
}