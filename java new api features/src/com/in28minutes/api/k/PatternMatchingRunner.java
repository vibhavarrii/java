package com.in28minutes.api.k;

public class PatternMatchingRunner {
	public static void main(String[] args) {
		Object objStr = "HELLO JAVA";
		instanceOfOld(objStr);
		instanceOfNew(objStr);

		
	}
	private static void instanceOfNew(Object objStr) {
		if(objStr instanceof String str ) {//allows declaration of variable along with instanceof 
			System.out.println(str.toLowerCase());
		}
	}

	private static void instanceOfOld(Object objStr) {
		if(objStr instanceof String ) {
			String str = (String) objStr;
			System.out.println(str.toLowerCase());
		}
	}

}
