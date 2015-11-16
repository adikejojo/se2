package LMS.dataservice;

import java.rmi.RemoteException;

import LMS.po.UserPO;

public interface UserPOService {
	
	public void insert(UserPO po) throws RemoteException;
}
