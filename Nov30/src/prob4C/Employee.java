abstract class Employee {
	private int empId;
	
	public void print() {
		
	}
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	public abstract Double calcGrossPay(int month, int year);

	public Paycheck calcCompensation(int month, int year) {
		Double grossPay = calcGrossPay(month, year);
		Paycheck pc = new Paycheck(grossPay);
		return pc;
	}
	
}