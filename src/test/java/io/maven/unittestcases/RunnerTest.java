package io.maven.unittestcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunnerTest {
	
	@Before
	public void setUp() {
		System.out.println("\nRunning setUp...");
	}

	@Test
	public void sumReturnsCorrectResult() {
		System.out.println("Running sumReturnsCorrectResult...");
		
		final int number1 = 3;
		final int number2 = 4;
		
		final int expected = 7;
		
		final int actual = Runner.sum(number1, number2);
		
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() {
		System.out.println("\nRunning tearDown...");
	}
	

}
