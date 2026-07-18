package com.conditionals;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		blah(number);
	}

	private static void blah(int number) {
		switch(number) {
		case 1:
			System.out.println(1);break;
		case 2:
		case 3:
			System.out.println("3");break;
		case 4:
			System.out.println("4");break;
			default:
				System.out.println("invalid");
		}
	}

}
