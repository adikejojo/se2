package businesslogic.receiptbl;


import po.AcceptReceiptPO;
import po.SendReceiptPO;
import po.receiverPO;
import po.senderPO;

public class infohelper {
	public SendReceiptPO getSendReceiptInfo(SendReceiptPO sendReceipt){
		receiverPO receiver = new receiverPO("zhangsan", "address1", "1382222222");
		senderPO sender = new senderPO("lisi", "address2", "1393333333");
		return new SendReceiptPO(sendReceipt.getOrder_barcode_number(),
				sender, receiver, sendReceipt.getExpress_type(), 20.0, 50.0);
	}
	
	public AcceptReceiptPO getAcceptReceiptInfo(AcceptReceiptPO acceptPO){
		String[] state = null;
		return new AcceptReceiptPO(acceptPO.getTransitCenter_number(), "11-11", "4321", "place",state);
	}
	
	public void getCollectionReceiptInfo(){
		
	}
	
	public void getDeliveryReceiptInfo(){
		
	}
	
	public void getEarningReceiptInfo(){
		
	}
	
	public void getloadingReceiptInfo(){
		
	}
	
	public void gettransitReceiptInfo(){
		
	}
	
	public void getPaymentReceiptInfo(){
		
	}
	
	public void getImportReceiptInfo(){
		
	}
	
	public void getExportReceiptInfo(){
		
	}

}
