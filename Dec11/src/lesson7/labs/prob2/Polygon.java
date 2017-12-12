package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve {
	
	public double[] getSides();
	default public double computePerimeter() {
		double permeter = 0.0;
		for (double side: getSides()) {
			permeter += side;
		}
		return permeter;
	}
}
