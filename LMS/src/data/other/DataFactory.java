package data.other;

import java.rmi.RemoteException;

import data.configurationdata.ConfigurationDataServiceImpl;
import data.financedata.FinanceDataServiceImpl;
import data.receiptdata.ReceiptDataServiceImpl;
import data.repertorydata.RepertoryDataServiceImpl;
import data.userdata.UserDataServiceImpl;
import dataservice.configurationdataservice.ConfigurationDataService;
import dataservice.financedataservice.FinanceDataService;
import dataservice.receiptdataservice.ReceiptDataService;
import dataservice.repertorydataservice.RepertoryDataService;
import dataservice.userdataservice.UserDataService;

public class DataFactory {
	public UserDataService getUserDatabase (DataType type)throws RemoteException{
		UserDataService data=new UserDataServiceImpl(type);
		return data;
	}
	public ReceiptDataService getReceiptDatabase (DataType type)throws RemoteException{
		ReceiptDataService data=new ReceiptDataServiceImpl(type);
		return data;
	}
	public RepertoryDataService getRepertoryDatabase (DataType type)throws RemoteException{
		RepertoryDataService data=new RepertoryDataServiceImpl(type);
		return data;
	}
	public FinanceDataService getFinanceDatabase (DataType type)throws RemoteException{
		FinanceDataService data=new FinanceDataServiceImpl(type);
		return data;
	}
	public ConfigurationDataService getConfigurationDatabase (DataType type)throws RemoteException{
		ConfigurationDataService data=new ConfigurationDataServiceImpl(type);
		return data;
	}
	
	
}
