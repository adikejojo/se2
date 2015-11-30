//package businesslogic.receiptblTEST;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import UI.mainUI.expressType;
//import businesslogic.receiptbl.Create;
//import businesslogic.receiptbl.Find;
//import businesslogic.receiptbl.Modify;
//import businesslogic.receiptbl.ReceiptController;
//import businesslogic.receiptbl.Remove;
//import po.AcceptReceiptPO;
//import po.SendReceiptPO;
//
//public class ReceiptControllerTest {
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void test() {
//		ReceiptController controller = new ReceiptController();
//		Create create = new Create();
//		Remove remove = new Remove();
//		Modify modify = new Modify();
//		Find find = new Find();
//		SendReceiptPO sendPO = new SendReceiptPO("1234", null, null, expressType.ECONOMIC,
//				10, 20);
//		assertEquals(true,create.add(sendPO));
//		AcceptReceiptPO acceptPO = new AcceptReceiptPO("1234", null, null, null, null);
//		assertEquals(true, create.add(acceptPO));
//		//
//		assertEquals(true,controller.add(sendPO));
//		assertEquals(true,controller.delete("1234"));
//		assertEquals(true, controller.modify("1234"));
//		assertEquals(true,controller.find("1234"));
//		
//	}
//
//}
