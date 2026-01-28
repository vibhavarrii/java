package com.conditionals;

public class SumOfDigits {
	public int getNumberOfDigits(int number) {
		if(number < 0)
			return -1;
		else if(number == 0)
			return 1;
		else {
			int count =0 ;
			while(number >0)
			{
				number/=10;
				count++;
			}
			return count;
		}
	}
	public static void main(String[] args) {
		SumOfDigits digits = new SumOfDigits();
		System.out.println(digits.getNumberOfDigits(10));
	}

}
