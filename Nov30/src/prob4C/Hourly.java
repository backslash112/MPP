class Hourly extends Employee {
	private Double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(int empId, Double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	public Double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * 4;
	}
}