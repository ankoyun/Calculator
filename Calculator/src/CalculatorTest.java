import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(4);
		calculator.add(5);
		assertEquals(9,calculator.getResult());
	}
	@Test
	public void testAdd2() {
		calculator.add(13);
		calculator.add(1);
		assertEquals(14,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(8);
		calculator.substract(4);
		assertEquals(4,calculator.getResult());
	}
	@Test
	public void testSubstract2() {
		calculator.add(16);
		calculator.substract(4);
		assertEquals(12,calculator.getResult());
	}

	@Test
	public void testMultiply() {
		calculator.add(4);
		calculator.multiply(6);
		assertEquals(24,calculator.getResult());
	}

	@Test
	public void testDivide() {
		calculator.add(24);
		calculator.divide(4);
		assertEquals(6,calculator.getResult());
	}

	@Test
	public void testSquare() {
		calculator.square(3);
		assertEquals(9,calculator.getResult());
	}

	@Test(timeout = 10)
	public void testSquareRoot() {
		calculator.squareRoot(36);
		assertEquals(6,calculator.getResult());
	}

	@Test
	public void testClear() {
		calculator.add(27);
		calculator.clear();
		assertEquals(0,calculator.getResult());
	}

	@Test
	public void testGetResult() {
	
	}

}
