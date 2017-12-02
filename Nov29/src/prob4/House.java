class House extends Property {
	
	private Double lotSize;
	
	public House(Double lotSize) {
		this.lotSize = lotSize;
	}
	
	@Override
	public Double computeRent() {
		return lotSize * 0.1;
	}	
}