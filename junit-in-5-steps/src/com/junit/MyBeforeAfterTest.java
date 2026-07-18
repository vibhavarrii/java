package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("0");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("1");
		
	}

	@Test
	void test1() {//has no particular order for execution
		System.out.println("test1");
	}
	
	@Test
	void Test2() {
		System.out.println("test2");
	}
	@Test
	void Test3() {
		System.out.println("test3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("3");
	}
	
	@AfterAll//add static for before all and after all
	static void afterAll() {
		System.out.println("0");
	}

}
