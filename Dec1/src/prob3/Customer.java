package lesson5.labs.prob3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	//private List<Order> orders;
	private Order order;
	public Customer(String name) {
		this.name = name;
		// orders = new ArrayList<Order>();
	}

	public setOrder(Order order) {
		this.order = order;
	}
	// public void addOrder(Order order) {
	// 	orders.add(order);
	// }
	public String getName() {
		return name;
	}
	// public List<Order> getOrders() {
	// 	return orders;
	// }
}
