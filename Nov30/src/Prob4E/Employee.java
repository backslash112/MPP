package prob4E;

import java.util.*;

public class Employee {
	
	private String name;
	private List<Account> accounts = new ArrayList<>();
	
	public Employee(String name) {
		this.name = name;
	}
	public double computeUpdatedBalanceSum() {
		//implement
		double updatedBalanceSum = 0.0;
		for (Account a: accounts) {
			updatedBalanceSum += a.computeUpdatedBalance();
		}
		return updatedBalanceSum;
	}
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	
}
