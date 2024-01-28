package testdemo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertMethods() {
		String str1 = new String("Priya");
		String str2 = new String("Priya");
		String str3;
		String str4="Priya";
		String str5 ="Priya";
		//Check whether 2 objects have equal value
		assertEquals(str1, str2);
		
		//Check whether 2 references are same
		assertSame(str4, str5);
		assertNotSame(str1, str2);
		
		int val1=5;
		int val2=6;
		
		//assertTrue(val1>val2);
		assertFalse(val1>val2);
		
		String[] expectedArray= {"one","two","three"};
		String[] actualArray= {"one","two","three"};
		
		assertArrayEquals(expectedArray, actualArray);
	}

}
