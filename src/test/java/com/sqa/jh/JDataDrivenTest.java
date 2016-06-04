/**
 *   File Name: JDataDrivenTest.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 1, 2016
 *   
 */

package com.sqa.jh;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class JDataDrivenTest {

	@Parameters
	public static Object[][] data() {
		return new Object[][] { { 0, 5, 15 }, { 1, 5, 6 }, { 100, 5, 105 } };
	}

	private int expResult;
	private int op1;
	private int op2;

	public JDataDrivenTest(int input1, int input2, int expected) {
		this.op1 = input1;
		this.op2 = input2;
		this.expResult = expected;
	}

	@Test
	public final void testAdd() {
		// int actual = Calculator.add(this.op1, this.op2);
		// assertEquals("actual not matching with expected", actual,
		// this.expResult);
	}
}
