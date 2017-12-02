package prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double updatedBalanceSum = 0.0;
		for (Employee e: list) {
			updatedBalanceSum += e.computeUpdatedBalanceSum();
		}
		return updatedBalanceSum;
	}
}
