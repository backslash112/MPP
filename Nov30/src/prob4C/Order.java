class Order {
	private int orderNo;
	private int orderDate;
	private Double orderAmount;
	
	public int getOrderDate() {
		return orderDate;
	}
	
	public Double getOrderAmount() {
		return orderAmount;
	}
	public Order(int orderNo, int orderDate, Double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
}