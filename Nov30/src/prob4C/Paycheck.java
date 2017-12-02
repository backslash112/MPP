class Paycheck {
	private Double grossPay;  // total salary
	private Double fica = 0.23;  // FICA 23%
	private Double state = 0.05;  // State tax 5%
	private Double local = 0.01;  // Local tax 1%
	private Double medicate = 0.03;  // Medicare 3%
	private Double socialSecurity = 0.075;  // 7.5%
	
	public void print() {
		
	}
	public Paycheck(Double grossPay) {
		this.grossPay = grossPay;
	}
	
	public Double getNetPay() {
		return grossPay * (1 - fica - state - local - medicate - socialSecurity);
	}
}