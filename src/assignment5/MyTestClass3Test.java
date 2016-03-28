package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTestClass3Test {

	@Test
	public void testSubtract() {
		MyTestClass3 testObj = new MyTestClass3();
		assertEquals("message", 5, testObj.subtract(10, 5));
	}

}
