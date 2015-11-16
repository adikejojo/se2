package LMS.dataservice;

import java.rmi.RemoteException;

import LMS.po.FinancePO;

public interface FinancePOService {
	public FinancePO find(String id) throws RemoteException;
	
	public void insert(FinancePO po) throws RemoteException;
	
	public void delete(FinancePO po) throws RemoteException;
	
	public void update(FinancePO po) throws RemoteException;
	
	public void init() throws RemoteException;
	
	public void finish() throws RemoteException;

}
