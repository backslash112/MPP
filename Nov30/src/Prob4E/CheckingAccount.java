package prob4E;

class CheckingAccount extends Account {

	private double balance;
	private double monthlyFee;
	private String accId;
		
	public CheckingAccount(String accId, double fee, double startBalance) {
		super();
		this.accId = accId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}
	
	public String getAccountID() {
		return this.accId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}
	
}