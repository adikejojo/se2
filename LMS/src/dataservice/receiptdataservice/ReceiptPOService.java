package dataservice.receiptdataservice;

import java.rmi.RemoteException;

import po.ReceiptPO;

public interface ReceiptPOService {

	public ReceiptPO find(String id) throws RemoteException;
	
	public void insert(ReceiptPO po) throws RemoteException;
	
	public void delete(ReceiptPO po) throws RemoteException;
	
	public void update(ReceiptPO po) throws RemoteException;
	
	public void init() throws RemoteException;
	
	public void finish() throws RemoteException;
}
