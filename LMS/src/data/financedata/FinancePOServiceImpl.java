package data.financedata;

import java.rmi.RemoteException;

import dataservice.financedataservice.FinancePOService;
import po.FinancePO;

public class FinancePOServiceImpl implements FinancePOService{
	private int type;
	public FinancePOServiceImpl(int type){
		this.type=type;
	}
	public FinancePO find(String id) throws RemoteException{
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
		FinancePO finance=new FinancePO();
		return finance;
	}
	
	public void insert(FinancePO po) throws RemoteException{
		
	}
	
	public void delete(FinancePO po) throws RemoteException{
		
	}
	
	public void update(FinancePO po) throws RemoteException{
		
	}
	
	public void init() throws RemoteException{
		
	}
	
	public void finish() throws RemoteException{
		
	}
}
