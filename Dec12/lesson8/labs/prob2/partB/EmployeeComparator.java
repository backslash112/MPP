package lesson8.labs.prob2.partB;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		int result = e1.name.compareTo(e2.name);
		if (result != 0) {
			return result;
		} else {
			if(e1.salary == e2.salary) return 0;
			else if(e1.salary < e2.salary) return -1;
			else return 1;
		}
	}

}
