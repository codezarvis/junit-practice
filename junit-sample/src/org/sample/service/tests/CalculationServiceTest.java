/**
 * 
 */
package org.sample.service.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sample.service.CalculationService;

/**
 * @author M1033375
 *
 */
public class CalculationServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
	}

	@Test
	public void testFindMax() {
		System.out.println("In Test == FindMax");
		assertEquals(-1,
				CalculationService.findMax(new int[] { -1, -3, -4, -2 }));
	}

	@Test
	public void testReverseWord() {
		System.out.println("In Test == ReverseWord");
		assertEquals("liril", CalculationService.reverseWord("liril"));
	}

	@Test
	public void testCube() {
		System.out.println("In Test == Cube");
		assertEquals(4, CalculationService.cube(2));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("After Class");
	}
}
