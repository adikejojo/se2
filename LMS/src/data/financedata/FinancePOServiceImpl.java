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
		String[] institutionID={"1","2","3"};
		String[][] personID={{"0","0"},{"0","0"}};
		String[] vehicleID={"4","5","6"};
		//type==0,Mysql
		//type==1,txt
		//type==2,ser
		FinancePO finance=new FinancePO(institutionID, personID, vehicleID);
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
