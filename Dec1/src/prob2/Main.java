package prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry circle = new Circle(100);
		Geometry rectange = new Rectange(30, 50);
		Geometry triangle = new Triangle(10, 20);
		
		Geometry[] geometries = { circle, rectange, triangle };
		
		double sumAreas = 0.0;
		for (Geometry g: geometries) {
			sumAreas += g.computeArea();
		}
		System.out.println("Sum of Areas = " + sumAreas);
	}

}
