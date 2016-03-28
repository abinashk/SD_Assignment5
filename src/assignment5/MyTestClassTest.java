package assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTestClassTest {

	@Test
	public void testMultiply() {
		
		MyTestClass testObj = new MyTestClass();
		assertEquals("message", 50, testObj.multiply(5, 10));
//		assertEquals("message2", 10, testObj.multiply(0, 10));
	}

}
