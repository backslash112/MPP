class Salaried extends Employee {
	private Double salary;
	
	public Salaried(int empId, Double salary) {
		super(empId);
		this.salary = salary;
	}
	
	public Double calcGrossPay(int month, int year) {
		return salary;	}
}