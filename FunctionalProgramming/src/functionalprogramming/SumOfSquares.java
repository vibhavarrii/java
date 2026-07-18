package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfSquares {
	public static long sumsquare(List<Integer>numbers) {
		if(numbers==null)
			return 0;
		else {
			return numbers.stream().mapToLong(i->i*i).sum();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for(int i=0;i<n;i++) {
			numbers.add(sc.nextInt());
		}
		long result = sumsquare(numbers);
		System.out.println("result:"+result);
		sc.close();
				

	}

}
