class Cylinder {
	
	private Circle circle;
	public Double height;
	
	public Double computeVolume() {
		return circle.compulateArea() * height;
	}
}