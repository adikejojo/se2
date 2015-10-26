package data.configurationdata;

import java.rmi.RemoteException;

import po.ConfigurationPO;
import data.other.DataType;
import dataservice.configurationdataservice.ConfigurationDataService;

public class ConfigurationDataServiceImpl implements ConfigurationDataService{
	private DataType type;
	public ConfigurationDataServiceImpl(DataType type2) {
		this.type=type2;
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
