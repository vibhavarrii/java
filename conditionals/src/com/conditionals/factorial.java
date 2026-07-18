package com.conditionals;

public class factorial {
	public int calculateFactorial(int number) {
		if(number < 0)
			return -1;
		else {
			int factorial = 1;
			for(int i = 1 ;i<= number;i++) {
				factorial *= i;
			}
			return factorial;
			
		}
		
	}

public static void main(String[] args) {
	factorial fac = new factorial();
	System.out.println(fac.calculateFactorial(3));
	
}
}
