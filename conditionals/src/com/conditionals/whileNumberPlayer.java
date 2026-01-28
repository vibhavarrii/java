package com.conditionals;

public class whileNumberPlayer {

	private int limit;

	public whileNumberPlayer(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
		
	}

	public void printSquaresUptoLimit() {
		int i = 0;
		// TODO Auto-generated method stub
		while(i<=limit) {
			System.out.println(i*i);
			i++;
			
			
		}
		
	}

	public void printCubesUptoLimit() {
		int i = 0;
		// TODO Auto-generated method stub
		while(i<=limit) {
			System.out.println(i*i*i);
			i++;
		
		
	}
	
	

	}
}
