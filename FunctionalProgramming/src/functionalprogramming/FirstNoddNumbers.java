package functionalprogramming;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNoddNumbers{
	public static List<Integer> cubes (int n){
		return IntStream.range(1, n+1).map(i->i*i*i).boxed().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		List<Integer>cube= cubes(n);
		System.out.println("cubes"+cube);
		sc.close();

	}

}
