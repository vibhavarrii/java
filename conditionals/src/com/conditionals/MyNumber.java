package com.conditionals;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if(number <= 1 ) {
			return false;
		}
		else {
				for ( int i = 2 ;i <= number/2 ; i++) {
					if (number % i == 0) {
						return false;
					}
			}
				return true;
		}
	}

	public int sumUptoN() {
		int sum = 0;
		// TODO Auto-generated method stub
		for(int i =0 ;i <= number ; i++) {
			  sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		// TODO Auto-generated method stub
		for(int i =2 ; i<= number ; i++) {
			if(number % i == 0) {
				 sum += i;
			}
		}
		return sum;
	}

	public void printANumberTriangle() {
		// TODO Auto-generated method stub
		for(int i = '*';i<= number ;i++) {
			for(int j = '*' ; j<=i;j++) {
			System.out.print(j );			
			
		}
			System.out.println();
	}

	
}
}

