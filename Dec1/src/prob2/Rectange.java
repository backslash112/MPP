package prob2;

public class Rectange implements Geometry {

	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public Rectange(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

}
