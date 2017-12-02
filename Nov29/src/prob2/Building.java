import java.util.*;

class Building {
	private List<Apartment> apts;
	
	public Building(List<Apartment> apts) {
		this.apts = apts;
	}
	public Double getProfit() {
		Double profit = 0.0;
		for (Apartment apt: apts) {
			profit += apt.getRent();
		}
		return profit;
	}
}