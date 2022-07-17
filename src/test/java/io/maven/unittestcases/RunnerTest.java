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
	public void sumReturnsCorrectResult1() {
		System.out.println("Running sumReturnsCorrectResult...");
		
		final int number1 = 3;
		final int number2 = 4;
		
		final int expected = 7;
		
		final int actual = Runner.sum(number1, number2);
		
		assertEquals(expected, actual);
	}
	@Test
	public void sumReturnsCorrectResult2() {
		System.out.println("Running sumReturnsCorrectResult...");
		
		final int number1 = 4;
		final int number2 = 4;
		
		final int expected = 2;
		
		final int actual = Runner.sum(number1, number2);
		
		assertEquals(expected, actual);
	}
	@Test
	public void sumReturnsCorrectResult3() {
		System.out.println("Running sumReturnsCorrectResult...");
		
		final int number1 = 9;
		final int number2 = 9;
		
		final int expected = 18;
		
		final int actual = Runner.sum(number1, number2);
		
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() {
		System.out.println("\nRunning tearDown...");
	}
	

}
