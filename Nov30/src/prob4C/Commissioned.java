import java.util.*;

class Commissioned extends Employee {
	private List<Order> orders;	
	private Double commission;
	private Double baseSalary;
	
	public Commissioned(int empId, Double baseSalary, Double commission, List<Order> orders) {
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
		this.orders = orders;
	}
	
	public Double calcGrossPay(int month, int year) {
		Double totalOrderAmount = 0.0;
		for (Order o: orders) {
			if (o.getOrderDate() == month) {
				totalOrderAmount += o.getOrderAmount();
			}
		}
		return baseSalary + commission + totalOrderAmount;
	}
}