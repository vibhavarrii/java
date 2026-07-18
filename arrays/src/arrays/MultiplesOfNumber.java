package arrays;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfNumber {
	public List<Integer> determineMultiples(int number, int limit) {
		List<Integer>multiple = new ArrayList<>();
		if(number <= 0 || limit <=0 )
			return new ArrayList<>();
		for(int i = number ;i <= limit ; i+= number) {
			multiple.add(i) ;
		}
		return multiple ;
	}
	public static void main(String[] args) {
		MultiplesOfNumber mul = new MultiplesOfNumber();
		System.out.println(mul.determineMultiples(3,5));
		
		
	}

}
