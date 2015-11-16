package LMS.dataservice;

import java.rmi.RemoteException;

import LMS.po.ConfigurationPO;

public interface ConfigurationPOService {

	public ConfigurationPO find(String id) throws RemoteException;
	
	public void insert(ConfigurationPO po) throws RemoteException;
	
	public void delete(ConfigurationPO po) throws RemoteException;
	
	public void update(ConfigurationPO po) throws RemoteException;
	
	public void init() throws RemoteException;
	
	public void finish() throws RemoteException;
}
