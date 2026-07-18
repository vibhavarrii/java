package exceptionHandling;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
		 sc = new Scanner(System.in);
		int[] numbers = {1,2,3,4};
		int number = numbers[2];
		System.out.println(number);
		sc.close();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}finally {
			sc.close();
			System.out.println("closed");//code in finally is always executed
			
		}

	}

}
