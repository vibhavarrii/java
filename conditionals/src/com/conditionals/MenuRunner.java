package com.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("the number you entred is :"+number1);
		System.out.println("enter the second number : ");
		int number2 = scanner.nextInt();
		System.out.println("the number you entered is " + number2);
		System.out.println("menu : \n 1.addition \n2.subtraction \n3.Multiplication \n4.Division");
		System.out.println("Enter your choice :");
		int choice = scanner.nextInt();
		System.out.println("your entered choice is :" + choice);
		
		performOperationUsingSwitch(number1, number2, choice);
	}

	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1: System.out.println("addition: "+(number1+number2)); break;
		case 2:System.out.println("subtraction: "+(number1-number2)); break;
		case 3: System.out.println("multiplication: "+(number1 * number2)); break;
		case 4:System.out.println("division: "+(number1 / number2)); break;
		default:System.out.println("invalid ");
		}
	}
}
