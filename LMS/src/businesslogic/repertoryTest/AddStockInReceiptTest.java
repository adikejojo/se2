package businesslogic.repertoryTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesslogic.repertorybl.StockIn;

public class AddStockInReceiptTest {

	StockIn si=new StockIn();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		MockItemList list=new MockItemList();
		si.addStockInReceipt(list);
		
		//fail("Not yet implemented");
	}

}
