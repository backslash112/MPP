package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow book;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		book = (BookWindow) ob;
		nonemptyRule();  // rule 1
		isbnNumbericRule();  // rule 2
		isbnLengthRule();  // rule 3,4
		priceLengthRule();  // rule 5
		priceValueRule();  // rule 6
	}

	private void nonemptyRule() throws RuleException {
		if(book.getIsbnValue().trim().isEmpty() ||
				book.getTitleValue().trim().isEmpty() ||
				book.getPriceValue().trim().isEmpty()) {
					throw new RuleException("All fields must be non-empty!");
				}
	}

	private void isbnNumbericRule() throws RuleException {
		String val = book.getIsbnValue().trim();
		try {
			Integer.parseInt(val);
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
		if (val.length() != 10 && val.length() != 13) {
			throw new RuleException("ISBN must be consist of either 10 or 13 characters");
		}
	}

	private void isbnLengthRule() throws RuleException {
		String val = book.getIsbnValue().trim();
		if (val.length() == 10) {
			if (val.charAt(0) != "0" && val.charAt(0) != "1") {
				throw new RuleException("ISBN must start with 0 or 1 if it has 10 length");
			}
		}

		if (val.length() == 13) {
			if (!val.substring(0, 3).equals("978") && !val.substring(0, 3).equals("979")) {
				throw new RuleException("ISBN must start with 978 or 979 if it has 13 length");
			}
		}
	}

	private void priceLengthRule() throws RuleException {
		String price = book.getPriceValue().trim();
		try {
			Double.parseDouble(price);
		} cath(NumberFormatException) {
			throw new RuleException("Price must be a floating point number");
		}
		if (price.indexOf(".") == -1) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}
		String[] splitter = price.split("\\.");
		if (splitter[1].length() != 2) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}
	}

	private void priceValueRule() throws RuleException {
		Double price = Double.parseDouble(book.getPriceValue().trim());
		if (price < 0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
	}

}
