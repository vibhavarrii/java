package com.conditionals;

public class ReverseNumber {
	public int reverseNumber(int number) {
		if(number < 0)
			return -1;
		if(number == 0)
			return 0;
		else {
			int reversed = 0;
			while(number >0) {
			int digit = number %10 ;
			reversed = reversed * 10 +digit; 
			number = number /10;
		}
			return reversed;
	}

}
	public static void main(String[] args) {
		ReverseNumber num = new ReverseNumber();
		System.out.println(num.reverseNumber(78));
	}
}
