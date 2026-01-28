package collections;

import java.util.HashMap;
import java.util.Map;

public class StringMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awesome occasion . This has never is  happened before";
		Map<String,Integer>occurances = new HashMap<>();
		String[] words = str.split(" ");
		for(String word:words) {
			Integer integer = occurances.get(word);
			if(integer == null) {
				occurances.put(word, 1);
			}else {
				occurances.put(word, integer+1);
			}
			
			
		}
		System.out.println(occurances);
		

	}

}
