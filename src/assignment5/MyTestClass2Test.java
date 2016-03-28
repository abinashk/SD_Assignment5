package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTestClass2Test {

	@Test
	public void testAddition() {
		MyTestClass2 testObj = new MyTestClass2();
		assertEquals("message", 15, testObj.addition(5, 10));
	}

}
