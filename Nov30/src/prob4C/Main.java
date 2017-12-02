import java.util.*;

class Main {
	public static void main(String[] args) {
		Employee hourlyEmployee = new Hourly(10001, 100.0, 4);
		Employee salariedEmployee = new Salaried(10002, 3000.0);
		List<Order> orders = new ArrayList<Order>();
		Order order1 = new Order(1001, 10, 100.0);
		Order order2 = new Order(1002, 10, 110.0);
		orders.add(order1);
		orders.add(order2);
		Employee commissionedEmployee = new Commissioned(10003, 1000.0, 300.0, orders);
		Paycheck pc1 = hourlyEmployee.calcCompensation(10, 2017);
		System.out.println(pc1.getNetPay());
		Paycheck pc2 = salariedEmployee.calcCompensation(10, 2017);
		System.out.println(pc2.getNetPay());
		Paycheck pc3 = commissionedEmployee.calcCompensation(10, 2017);
		System.out.println(pc3.getNetPay());
	}
}