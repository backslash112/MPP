import java.util.*;

class Landlord {
	private List<Building> buildings;
	
	public Landlord(List<Building> bs) {
		this.buildings = bs;
	}
	public Double getTotalProfits() {
		Double total = 0.0;
		for (Building b: buildings) {
			total += b.getProfit();
		}
		return total;
	}
}