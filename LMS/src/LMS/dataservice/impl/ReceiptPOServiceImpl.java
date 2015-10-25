package LMS.dataservice.impl;

import java.rmi.RemoteException;

import LMS.dataservice.ReceiptPOService;
import LMS.po.ReceiptPO;

public class ReceiptPOServiceImpl implements ReceiptPOService{
	private int type;
	public  ReceiptPOServiceImpl(int type){
		this.type=type;
	}
	@Override
	public ReceiptPO find(String id) throws RemoteException {
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
		return null;
	}

	@Override
	public void insert(ReceiptPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
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
