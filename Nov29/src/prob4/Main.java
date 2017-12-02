class Main {
	public static void main(String[] args) {
		Property house = new House(100.0);
		Property condo = new Condo(3);
		Property triler = new Triler();
		
		Property[] p = { house, condo, triler };
		Admin admin = new Admin(p);
		System.out.println(admin.calculateTotalRents());
	}
}