package com.conditionals;

import java.util.Scanner;

public class doWhileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		do {
			System.out.println(number * number * number);
			System.out.println("enter a number ");
			number = scanner.nextInt();
			
		}while(number >= 0);

	}

}
