package LMS.dataservice.impl;

import java.rmi.RemoteException;

import LMS.dataservice.UserPOService;
import LMS.po.UserPO;

public class UserPOServiceImpl implements UserPOService{
	private int type;
	public UserPOServiceImpl(int type){
		this.type=type;
	}
	public void insert(UserPO po) throws RemoteException{
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
	}
	
}
