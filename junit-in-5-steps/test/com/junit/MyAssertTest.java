package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String>todos = Arrays.asList("AWS","Azure","DevOps");

	@Test
	void test() {
		boolean test =todos.contains("AWS");
		boolean test2=todos.contains("gcp");
		assertTrue(test);
		assertFalse(test);
		assertEquals(3,todos.size());
	
	}

}
