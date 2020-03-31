package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.Factorial;

public class FactorialTest {

	@Test
	public void testfactorial6() {
		assertEquals("3", Factorial.check(6));
	}

	@Test
	public void testfactorial18() {
		assertEquals("NONE", Factorial.check(18));
	}

	@Test
	public void testfactorial3628800() {
		assertEquals("10", Factorial.check(3628800));
	}

	@Test
	public void testfactorial479001600() {
		assertEquals("12", Factorial.check(479001600));
	}

}
