package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	//whenever we want to create an immutable list from the existing list we can use copyOf method
	

	public static void main(String[] args) {
		List<String>names = new ArrayList<String>();
		names.add("hii");
		names.add("low");
		names.add("high");
		List<String> copyOfNames = List.copyOf(names); 
		doNotChange(copyOfNames);
		

	}

	private static void doNotChange(List<String> names) {
		// TODO Auto-generated method stub
		names.add("useless");
		
	}

}
