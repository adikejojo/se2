package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface UserPOService {
	
	public void insert(UserPO po) throws RemoteException;
}
