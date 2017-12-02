package prob2B;
import java.util.*;

public class Order {
	private int orderNum;
	private List<OrderLine> orderLines;
	
	public Order(int orderNum) {
		this.orderNum = orderNum; 
	}
	
    public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	
}
