package prob2;

public class Triangle implements Geometry {

	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	public Triangle(double base, double height) {
		this.base =  base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return  0.5 * base * height;
	}

}
