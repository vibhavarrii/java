package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentMap<Character , LongAdder>occurances = new ConcurrentHashMap<>(); 
		String str ="ABCD ABCD ABCD ABCD";
		for(char character : str.toCharArray()) {
			occurances.computeIfAbsent(character,ch-> new LongAdder()).increment();;
		}
		System.out.println(occurances);
		
		

	}

}
