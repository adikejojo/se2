package data.other;

import java.rmi.RemoteException;

import data.configurationdata.ConfigurationPOServiceImpl;
import data.financedata.FinancePOServiceImpl;
import data.receiptdata.ReceiptPOServiceImpl;
import data.repertorydata.RepertoryPOServiceImpl;
import data.userdata.UserPOServiceImpl;
import dataservice.configurationdataservice.ConfigurationPOService;
import dataservice.financedataservice.FinancePOService;
import dataservice.receiptdataservice.ReceiptPOService;
import dataservice.repertorydataservice.RepertoryPOService;
import dataservice.userdataservice.UserPOService;

public class DataFactory {
	public UserPOService getUserDatabase (int type)throws RemoteException{
		UserPOService data=new UserPOServiceImpl(type);
		return data;
	}
	public ReceiptPOService getReceiptDatabase (DataType type)throws RemoteException{
		ReceiptPOService data=new ReceiptPOServiceImpl(type);
		return data;
	}
	public RepertoryPOService getRepertoryDatabase (int type)throws RemoteException{
		RepertoryPOService data=new RepertoryPOServiceImpl(type);
		return data;
	}
	public FinancePOService getFinanceDatabase (int type)throws RemoteException{
		FinancePOService data=new FinancePOServiceImpl(type);
		return data;
	}
	public ConfigurationPOService getConfigurationDatabase (int type)throws RemoteException{
		ConfigurationPOService data=new ConfigurationPOServiceImpl(type);
		return data;
	}
	
	
}
