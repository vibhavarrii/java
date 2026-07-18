package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxEvenNumber {
	public static int maxEven(List<Integer>num) {
		if(num==null)
			return 0;
		else {
			return num.stream().filter(n->n%2==0).max(Integer::compare).orElse(0);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer>num = new ArrayList<>();
		for(int i=0;i<n;i++) {
			num.add(sc.nextInt());
		}
		int result = maxEven(num);
		System.out.println("max even number :"+result);
		sc.close();
		

	}

}
