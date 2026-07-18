package arrays;

import java.util.ArrayList;
import java.util.List;

public class FactorialUsingArrayList {
	public List<Integer> determineAllFactors(int number) {
		List<Integer>factors = new ArrayList<>();
		if(number<=0)
			return factors;
		for(int i =1 ;i <= number;i++) {
			if(number % i == 0)
				factors .add(i);
		}
		return factors;
		
	}
	public static void main(String[] args) {
		FactorialUsingArrayList fact =new FactorialUsingArrayList();
		System.out.println(fact.determineAllFactors(12));
		
	}

}
