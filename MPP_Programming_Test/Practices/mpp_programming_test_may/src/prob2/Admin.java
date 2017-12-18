package prob2;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = Arrays.asList(members).stream()
				.filter(
						m -> m.getCheckoutRecord().getCheckoutList().stream()
							.anyMatch(e -> e.getLendingItem().equals(item))
						)
				.map(m -> m.getPhone())
				.sorted()
				.collect(Collectors.toList());
		return phoneNums;
	}
}
