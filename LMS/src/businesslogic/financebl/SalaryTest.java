package businesslogic.financebl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalaryTest {
	private static Salary slr = new Salary();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testGetSalay() {
		double slrNum = slr.getSalary("1234567890");
		assertEquals(1, (int)slrNum);
	}

}
