package com.primitive;

import java.math.BigDecimal;

public class SimpleInterestRunner {
	public static void main(String[] args) {
	SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00" , "7.5");
	BigDecimal totalvalue = calculator.calculateTotalValue(5);
	System.out.println(totalvalue);
	}
	

}
