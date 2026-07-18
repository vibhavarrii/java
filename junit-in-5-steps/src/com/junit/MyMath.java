package com.junit;

public class MyMath {
	
	public int calculateSum(int[] numbers) {
		
		int sum=0;
		for(int nums:numbers) {
			sum+=nums;
		}
		return sum;
	}
	
	

}
