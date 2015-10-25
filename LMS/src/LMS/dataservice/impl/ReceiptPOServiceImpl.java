package LMS.dataservice.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;

import LMS.data.DataType;
import LMS.dataservice.ReceiptPOService;
import LMS.po.ReceiptPO;
import LMS.po.SendReceiptPO;

public class ReceiptPOServiceImpl implements ReceiptPOService{
	private DataType type;
	public  ReceiptPOServiceImpl(DataType type){
		this.type=type;
	}
	@Override
	public ReceiptPO find(String id) throws RemoteException {
		return null;
	}

	@Override
	public void insert(ReceiptPO po) throws RemoteException {
		SendReceiptPO srPO=(SendReceiptPO)po;
		if(this.type==DataType.TXT){
			try {
				BufferedWriter bw= new BufferedWriter(new FileWriter("/LMS/Data/SendReceipt/txt"));
				bw.write(srPO.getOrder_barcode_number()+";"+srPO.getPacking_expense()
						+";"+srPO.getToral_price()+";"+srPO.getExpress_type()+";"
						+srPO.getReceiver().getName()+";"+srPO.getSender().getName());
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void delete(ReceiptPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ReceiptPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
