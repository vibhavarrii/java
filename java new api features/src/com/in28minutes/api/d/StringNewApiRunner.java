package com.in28minutes.api.d;

public class StringNewApiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ".isBlank());
		System.out.println(" L ".strip().replace(" ", "1"));
		System.out.println(" L ".stripLeading().replace(" ", "2"));
		System.out.println(" L ".stripTrailing().replace(" ", "3"));
		"line1\nline2\nline3\nline4".lines().forEach(System.out::println);
		System.out.println("UPPER".transform(s->s.substring(2)));
		System.out.println("my name is %s".formatted("joe"));

	}

}
