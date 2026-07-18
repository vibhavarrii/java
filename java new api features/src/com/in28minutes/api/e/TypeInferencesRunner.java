package com.in28minutes.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names1 = List.of("ram","ravi");
		List<String>names2 = List.of("joe","jhon");
		//List<List<String>> names = List.of(names1,names2);
		var names = List.of(names1,names2);

	}

}
