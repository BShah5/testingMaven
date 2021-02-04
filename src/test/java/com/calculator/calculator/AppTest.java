package com.calculator.calculator;

import com.calculator.calculator.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	/**
     * Create the test case
     * 
     * @param testName name of the test case
     */
	public AppTest(String testName) {
		super(testName);
	}
	
	/**
     * @return the suite of tests being tested
     */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
	/**
     * Rigorous Test :-)
     */
	public void testApp() {
		App a = new App(0, 0);
		a.a=5;
        a.b=10;
        assertEquals(15,a.add());
        assertEquals(-5,a.subtract());
	}
}