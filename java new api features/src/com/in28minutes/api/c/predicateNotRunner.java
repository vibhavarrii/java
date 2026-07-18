package com.in28minutes.api.c;

import java.util.List;
import java.util.function.Predicate;

public class predicateNotRunner {
	public static boolean isEven(int number) {
		return number%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers= List.of(1,2,3,4,5,6);
//		Predicate<Integer>evenNumberpredicate = number->number%2==0;
//		numbers.stream().filter(evenNumberpredicate).forEach(System.out::println);
//		numbers.stream().filter(predicateNotRunner::isEven).forEach(System.out::println);
		numbers.stream().filter(Predicate.not(predicateNotRunner::isEven)).forEach(System.out::println);
		

	}

}
