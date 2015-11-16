package businesslogic.receiptbl;

import po.SendReceiptPO;

public class ReceiptController {
	public boolean add(SendReceiptPO sendPO){
		Create create = new Create();
		create.add(sendPO);
		return true;
	}
	
	public boolean delete(String ID){
		Remove remove = new Remove();
		remove.delete(ID);
		return true;
	}
	
	public boolean modify(String ID){
		Modify modify = new Modify();
		modify.modify(ID);
		return true;
	}
	
	public boolean find(String ID){
		Find find = new Find();
		find.find(ID);
		return true;
	}
}
