package prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream().map(e -> e.computeUpdatedBalanceSum())
				.mapToDouble(d -> d)
				.sum();
	}
}
