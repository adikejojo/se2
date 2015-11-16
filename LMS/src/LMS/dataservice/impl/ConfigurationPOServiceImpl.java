package LMS.dataservice.impl;

import java.rmi.RemoteException;

import LMS.dataservice.ConfigurationPOService;
import LMS.po.ConfigurationPO;

public class ConfigurationPOServiceImpl implements ConfigurationPOService{
	private int type;
	public ConfigurationPOServiceImpl(int type) {
		this.type=type;
	}

	@Override
	public ConfigurationPO find(String id) throws RemoteException {
		//id==0,Mysql
		//id==1,txt
		//id==2,ser
		return null;
	}

	@Override
	public void insert(ConfigurationPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ConfigurationPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ConfigurationPO po) throws RemoteException {
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
