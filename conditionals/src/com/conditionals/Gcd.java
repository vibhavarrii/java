package com.conditionals;

public class Gcd {
	private int number1;
	private int number2;
	
	public Gcd(int number1 , int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public int number2() {
		return number2;
	}
	public int calculateGcd() {
		if(number1==0 || number2 == 0)
			return 0;
		else if(number1 <0 || number2<0)
			return 1;
		else {
			while(number2 != 0) {
				int temp = number2;
				number2 =number1%number2;
				number1 = temp;				
			}
			return number1;
		}
		
	}
	public static void main(String[] args) {
		Gcd num = new Gcd(20,15);
		System.out.println(num.calculateGcd());
		
		
	}
	

}
