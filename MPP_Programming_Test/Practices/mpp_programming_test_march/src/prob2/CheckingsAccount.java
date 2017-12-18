package prob2;

public class CheckingsAccount extends Account {

	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return this.accId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return this.balance - this.monthlyFee;
	}
	
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingsAccount(String accId, double fee, double startBalance) {
		this.balance = startBalance;
		this.monthlyFee = fee;
		this.accId = accId;
	}

}
