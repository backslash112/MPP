package prob4E;

abstract class Account {
	
	public abstract String getAccountID();
	public abstract double getBalance();
	public abstract double computeUpdatedBalance();
	public Account() {
		
	}
}