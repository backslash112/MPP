package prob2;

import java.util.*;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<>();

	public List<CheckoutRecordEntry> getCheckoutList() {
		return checkoutEntryList;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		this.checkoutEntryList.add(entry);
	}
}
