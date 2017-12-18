package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	private ItemType itemType;
	
	private LendingItem lendingItem;

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public ItemType getLendingItemType() {
		return itemType;
	}
	
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.lendingItem = item;
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.itemType = type;
	}

	
}
