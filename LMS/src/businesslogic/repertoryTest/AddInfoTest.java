package businesslogic.repertoryTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import UI.mainUI.expressType;
import businesslogic.repertorybl.Item;
import businesslogic.repertorybl.StockIn;

public class AddInfoTest {

	StockIn si=new StockIn();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		String id="000000";
		MockItem item=new MockItem("000000", null);
		si.addInfo(id);
		assertEquals((Item)item,si.addInfo(id));
		//fail("Not yet implemented");
	}

}
