package testdemo;

import static org.junit.Assert.assertEquals;   // static imports

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hexa.Calculate;

public class CalculateTest {
	
	
	Calculate  calc;
	@BeforeClass
	public static void setUpClass() {		// create instance using this method
		System.out.println("Setupclass called");	 
	}
		
	@Before
	public void setUp() {		// create instance using this method
		System.out.println("Setup called");
		calc = new Calculate();
	}
	
	@Test
	public void testAdd() {
		System.out.println("testAdd() called");
		assertEquals(100,calc.add(50,51));
	}
	
	@Test
	public void testMultiply() {
		System.out.println("testMultiply() called");
		assertEquals(6,calc.multiply(2,3));
	}
	
	@After
	public void tearDown() {
		System.out.println("TearDown Called");
		calc=null;
	}
	
	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("Run Once after class");
	}
	

}
