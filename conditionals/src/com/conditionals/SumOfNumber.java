package com.conditionals;

public class SumOfNumber {
	public int getSumOfDigits(int number) {
		if(number < 0)
			return -1;
		else if(number == 0)
			return 0;
		else {
			int sum = 0;
			while(number > 0) {
				sum +=number%10;// add the last digit first
				number = number/10;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		SumOfNumber number = new SumOfNumber();
		System.out.println(number.getSumOfDigits(555));
	}

}
