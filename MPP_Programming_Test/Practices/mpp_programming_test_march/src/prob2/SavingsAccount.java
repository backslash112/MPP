package prob2;

public class SavingsAccount extends Account {

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
		// TODO Auto-generated method stub
		return this.balance + (this.interestRate * this.balance);
	}

	private double balance;
	private double interestRate;
	private String accId;
	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}
}
