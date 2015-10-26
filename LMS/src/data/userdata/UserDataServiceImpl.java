package data.userdata;

import java.rmi.RemoteException;

import po.UserPO;
import data.other.DataType;
import dataservice.userdataservice.UserDataService;

public class UserDataServiceImpl implements UserDataService{
	private DataType type;
	public UserDataServiceImpl(DataType type2){
		this.type=type2;
	}
	public void insert(UserPO po) throws RemoteException{
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
	}
	
}
