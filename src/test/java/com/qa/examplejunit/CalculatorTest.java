package com.qa.examplejunit;
import com.qa.examplejunit.calculator.*;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SuppressWarnings("unused")

public class CalculatorTest {

	@Test
	public void add_test() {
		double result = Calculator.add(2, 5);
		assertEquals(7, result);
	}

	@Test
	public void subtract_test() {
		double result = Calculator.subtract(14, 3);
		assertEquals(11, result);
	}
	
	@Test
	public void divide_test() {
		double result = Calculator.divide(35, 7);
		assertEquals(5, result);
	}
	
	@Test
	public void multiply_test() {
		double result = Calculator.multiply(3, 9);
		assertEquals(27, result);
	}
}
