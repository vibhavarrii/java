package collections;

import java.util.Arrays;

public class Anagrams {
	public boolean areAnagrams(String str1 , String str2 ) {
		if(str1 == null|| str2 == null) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()!=str2.length()){
			return false;
		}
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams magic = new Anagrams();
		String a = "silent";
		String b = "LISTEN";
		boolean result = magic.areAnagrams(a, b);
		if (result) {
			System.out.println(a + " and " + b +" are anagrams");
		}
		else {
			System.out.println(a + " and " + b + " are not anagrams");
		}

	}

}
