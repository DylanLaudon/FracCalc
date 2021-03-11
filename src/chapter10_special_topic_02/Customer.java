package chapter10_special_topic_02;

public class Customer implements Cloneable {

	private String name;
	private BankAccount account;
	
	public Customer(String name) {
		this.name = name;
		this.account = new BankAccount();	
	}
	
	public Customer(String name, double initialBalance) {
		this.name = name;
		this.account = new BankAccount(initialBalance);
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return account.getBalance();
	}
	
	//Other methods are missing
	
	public Object clone() {
		try {
			Customer cloned = (Customer) super.clone();
			cloned.account = (BankAccount) account.clone();
			return cloned;
		}
		catch(CloneNotSupportedException e) {
			//Can't happen because we implement Cloneable
			return null;
		}
	}
}