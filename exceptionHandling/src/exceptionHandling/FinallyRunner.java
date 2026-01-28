package exceptionHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
		int[] numbers = {1,2,3,4};
		int number = numbers[2];
		System.out.println(number);

	}

}
}
