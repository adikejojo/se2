package LMS.dataservice.impl;

import java.rmi.RemoteException;

import LMS.dataservice.RepertoryPOService;
import LMS.po.RepertoryPO;

public class RepertoryPOServiceImpl implements RepertoryPOService{
	private int type;
	public RepertoryPOServiceImpl(int type){
		this.type=type;
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
