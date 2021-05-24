package com.qa.examplejunit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")

public class JunitExampleTest {
	// @Test annotation provided by Junit
	// @BeforeAll, @AfterAll - must be called off a static method
	
	@BeforeAll
	public static void start() {
		System.out.println("Test Beginning:\n");
	}
	
	@Test
	public void test1() {
		System.out.println("Initial test\n");
//		fail();
	}
	
	@AfterAll
	public static void end() {
		System.out.println("Tests Concluded.");
	}
}
