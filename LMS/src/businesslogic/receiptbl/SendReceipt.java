package businesslogic.receiptbl;

import java.rmi.RemoteException;

import po.SendReceiptPO;
import po.receiverPO;
import po.senderPO;
import UI.mainUI.expressType;
import businesslogicservice.receiptblservice.SendReceiptService;
import data.other.DataType;
import data.receiptdata.ReceiptPOServiceImpl;
import dataservice.receiptdataservice.ReceiptPOService;

public class SendReceipt implements SendReceiptService{
	String idNumber;
	SendReceiptPO sr;
	receiverPO receiver;
	senderPO sender;
	@Override
	public String makeReceiptID() {//stub
		this.idNumber = "1234567890";
		// TODO Auto-generated method stub
		return idNumber;
	}

	@Override
	public boolean submitSendReceipt(String nameS, String phoneS, String addressS, 
            String nameR, String phoneR, String addressR, 
            double weight, double volume, String content,
            expressType type, double packFee) {
		String ID = this.idNumber;
		receiver =new receiverPO(nameR,addressR,phoneR);
		sender =new senderPO(nameS,addressS,phoneS);
		sr =new SendReceiptPO("1234567890",sender,receiver,type,packFee,this.getPrice_stub());
		ReceiptPOService data=new ReceiptPOServiceImpl(DataType.TXT);
		try {
			data.insert(sr);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPrice() {
		return 0;
		
	}

	@Override
	public double getPrice_stub() {
		// TODO Auto-generated method stub
		return 100;
	}



}
