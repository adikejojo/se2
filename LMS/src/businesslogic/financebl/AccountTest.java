package businesslogic.financebl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account newAccount = new Account();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAccount() {
		boolean bn = newAccount.getAccount("1234567890")[0] == "ÄÇ¸öË­";
		boolean ba = newAccount.getAccount("1234567890")[1] == "1234567890";
		assertEquals(true, bn);
		assertEquals(true, ba);
		
	}

}
