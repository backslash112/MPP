package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {

	private double axis;
	private double elliptic;
	
	public Ellipse(double a, double e)  {
		this.axis = a;
		this.elliptic = e;
	}
	@Override
	public double computePerimeter() {
		return 4 * axis * elliptic;
	}

}
