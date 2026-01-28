package com.primitive;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	public boolean isvowel() {
		// TODO Auto-generated method stub
		if(ch == 'a'|| ch == 'e'|| ch == 'i'||ch =='o'||ch == 'u')
			return true;
		if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
			return true;
		else
			return false;
	}

	public boolean isalphabet() {
		// TODO Auto-generated method stub
		if(ch >= 97 && ch <= 122)
			return true;
		if(ch >= 65 && ch <= 90)
			return true;
		else
			return false;
	
	}

	public boolean isconsonant() {
		// TODO Auto-generated method stub
		if(isalphabet() && !isvowel())
			return true;
		else
			return false;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		for(char ch = 'a'; ch <= 'z' ;ch++) {
			System.out.println(ch);
		}
		
		
		
	}

	public static  void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		for(char ch = 'A' ;  ch <= 'Z'; ch++)
			System.out.println(ch);
		
	}

	

	

}
