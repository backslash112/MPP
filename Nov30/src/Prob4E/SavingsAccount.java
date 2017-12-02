//package prob4E;

class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accId;
	
	public SavingsAccount(String accId, double interestRate, double startBalance) {
		super();
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}
	
	public String getAccountID() {
		return this.accId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}
	
}