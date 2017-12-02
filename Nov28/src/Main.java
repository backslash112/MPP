import prob2A.*;
import prob2B.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student("Cun Yang");
		stu.setGradeReport(new GradeReport());
		
		Order order = new Order(1001);
		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		OrderLine orderLine = new OrderLine();
		orderLines.add(orderLine);
		order.setOrderLines(orderLines);
		
		System.out.println(stu);
		System.out.println(order);
	}

}
