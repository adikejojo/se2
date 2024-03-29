package LMS.dataservice;

import java.rmi.RemoteException;

import LMS.po.RepertoryPO;

public interface RepertoryPOService {
	
	public RepertoryPO find(String id) throws RemoteException;
	
	public void insert(RepertoryPO po) throws RemoteException;
	
	public void delete(RepertoryPO po) throws RemoteException;
	
	public void update(RepertoryPO po) throws RemoteException;
	 
	public void init() throws RemoteException;
	
	public void finish() throws RemoteException;
}
