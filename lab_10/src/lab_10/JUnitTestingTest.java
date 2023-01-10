package lab_10;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestingTest {

	@Test
	public void test() {
		JUnitTesting obj = new JUnitTesting();
		int output=obj.square(5);
		assertEquals(25,output);
	}

}
