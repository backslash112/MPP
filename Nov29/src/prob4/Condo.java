class Condo extends Property {
	
	private int numFloors;
	
	public Condo(int numFloors) {
		this.numFloors = numFloors;
	}
	
	@Override
	public Double computeRent() {
		return 400.0 * numFloors;
	}
}