package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labsolns.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty
 *  2. Price must be a floating point number with two decimal places
 *  3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {
  private CDWindow cd;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cd = (CDWindow) ob;
		nonemptyRule();
		priceLengthRule();
		priceValueRule();

	}

	private void nonemptyRule() throws RuleException {
		if(cd.getArtistValue().trim().isEmpty() ||
				cd.getTitleValue().trim().isEmpty() ||
				cd.getPriceValue().trim().isEmpty()) {
					throw new RuleException("All fields must be non-empty!");
				}
	}

	private void priceLengthRule() throws RuleException {
		String price = cd.getPriceValue().trim();
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
		Double price = Double.parseDouble(cd.getPriceValue().trim());
		if (price < 0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
	}

}
