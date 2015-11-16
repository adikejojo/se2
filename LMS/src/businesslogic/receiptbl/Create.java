package businesslogic.receiptbl;

import po.AcceptReceiptPO;
import po.CollectionReceiptPO;
import po.SendReceiptPO;

public class Create {
	infohelper helper = new infohelper();
	public boolean add(SendReceiptPO sendPO){
		boolean result = true;
		sendPO = helper.getSendReceiptInfo(sendPO);
		//when store operation fail, the value of result will change to false
		return result;
	}
	
	public boolean add(AcceptReceiptPO acceptPO){
		boolean result = true;
		acceptPO = helper.getAcceptReceiptInfo(acceptPO);
		return result;
	}
	public boolean add(CollectionReceiptPO collectionPO){
		boolean result = true;
		return result;
	}
}
