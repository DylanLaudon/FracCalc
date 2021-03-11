package chapter09_special_topic_04;

public class SecureAccount extends BankAccount {
	
	private String password;
	
	public SecureAccount(String password) {
		super();
		this.password = password;
	}
	
	/* This prevents another checkPassword method from
	 * simply overriding this checkPassword method
	 * to make it always return true (insecure method).
	 */
	public final boolean checkPassword(String password) {
		if (this.password.equals(password)) {
			return true;
		}
		return false;
	}
}