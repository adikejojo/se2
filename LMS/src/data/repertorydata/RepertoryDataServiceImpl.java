package data.repertorydata;

import java.rmi.RemoteException;

import po.RepertoryPO;
import data.other.DataType;
import dataservice.repertorydataservice.RepertoryDataService;

public class RepertoryDataServiceImpl implements RepertoryDataService{
	private DataType type;
	public RepertoryDataServiceImpl(DataType type2){
		this.type=type2;
	}
	@Override
	public RepertoryPO find(String id) throws RemoteException {
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
		return null;
	}

	@Override
	public void insert(RepertoryPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RepertoryPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RepertoryPO po) throws RemoteException {
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
