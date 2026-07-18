package com.conditionals;

public class LastDigit {
	public int getLastDigit(int number) {
		if(number < 0)
			return -1;
		else {
			int lastdigit = 0;
			for(int i = 0 ;i <=number ;i++)
			{
				lastdigit = i%10;
			}
			return lastdigit;
		}

}
	public static void main(String[] args) {
		LastDigit digit = new LastDigit();
		System.out.println(digit.getLastDigit(85));
	}
}
