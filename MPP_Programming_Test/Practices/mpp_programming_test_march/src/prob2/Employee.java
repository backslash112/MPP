package prob2;

import java.util.*;

public class Employee {
	public double computeUpdatedBalanceSum() {
		//implement
		return accounts.stream()
				.map(a -> a.computeUpdatedBalance())
				.mapToDouble(d->d)
				.sum();
	}
	
	private String name;
	private List<Account> accounts = new ArrayList<>();
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		this.accounts.add(acct);
	}
	
	public Employee(String name) {
		this.name = name;
	}
}
