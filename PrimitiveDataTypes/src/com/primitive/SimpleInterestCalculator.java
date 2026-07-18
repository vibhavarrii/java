package com.primitive;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
		
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalvalue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		// TODO Auto-generated method stub
		return totalvalue;
	}

}
