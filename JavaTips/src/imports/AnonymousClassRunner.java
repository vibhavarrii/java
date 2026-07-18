package imports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String str1 , String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());//this class has no name ..it can be directly written in main method
	}
	
}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>animals = new ArrayList<String>(List.of("ant","cat","elephant","dog"));
		Collections.sort(animals);
		//Collections.sort(animals,new LengthComparator() );
		System.out.println(animals);

	}

}
