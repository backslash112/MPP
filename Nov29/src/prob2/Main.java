import java.util.*;

class Main {
	public static void main(String[] args) {
		Apartment apt1 = new Apartment(400.0);
		Apartment apt2 = new Apartment(750.0);
		Apartment apt3 = new Apartment(1000.0);
		
		List<Apartment> apts1 = new ArrayList<Apartment>();
		apts1.add(apt1);
		List<Apartment> apts2 = new ArrayList<Apartment>();
		apts2.add(apt2);
		apts2.add(apt3);
		Building b1 = new Building(apts1);
		Building b2 = new Building(apts2);
		
		List<Building> bs = new ArrayList<Building>();
		bs.add(b1);
		bs.add(b2);
		Landlord ll = new Landlord(bs);
		System.out.print(ll.getTotalProfits());
		
	}
}