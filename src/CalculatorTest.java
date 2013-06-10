import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testNull() {
		assertTrue(Calculator.add(null) == 0);
	}

	@Test
	public void testBlankValue() {
		assertTrue(Calculator.add("") == 0);
	}

////	//
	@Test
	public void testWithOneValue() {
		assertTrue(Calculator.add("1") == 1);
		assertTrue(Calculator.add("111") == 111);
	}
	
	@Test
	public void testWithTwoValue() {
		assertTrue(Calculator.add("1,2") == 3);
	}
	@Test
	public void testUnknownNumberOfValue() {
		assertTrue(Calculator.add("1,2,3,4") == 10);
		assertTrue(Calculator.add("1,2,3,4,5") == 15);
	}
	@Test
	public void testWithNewLine() {
		assertTrue(Calculator.add("1\n2,3,4") == 10);
		assertTrue(Calculator.add("1\n2,3\n4") == 10);
	}
}
