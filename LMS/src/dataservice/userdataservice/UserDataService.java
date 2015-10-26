package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface UserDataService {
	
	public void insert(UserPO po) throws RemoteException;
}
