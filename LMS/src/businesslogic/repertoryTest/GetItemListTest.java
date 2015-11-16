package businesslogic.repertoryTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import UI.mainUI.expressType;
import businesslogic.repertorybl.StockOut;

public class GetItemListTest {

	StockOut so=new StockOut();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		MockItemList list=new MockItemList();
		so.getItemList(expressType.STANDARD,null);		
		
		//fail("Not yet implemented");
	}

}
