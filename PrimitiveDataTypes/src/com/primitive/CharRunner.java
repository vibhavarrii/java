package com.primitive;

public class CharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isvowel());
		System.out.println(myChar.isconsonant());
		System.out.println(myChar.isalphabet());
		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();

	}

}
