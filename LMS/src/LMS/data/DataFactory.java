package LMS.data;

import java.rmi.RemoteException;

import LMS.dataservice.ConfigurationPOService;
import LMS.dataservice.FinancePOService;
import LMS.dataservice.ReceiptPOService;
import LMS.dataservice.RepertoryPOService;
import LMS.dataservice.UserPOService;
import LMS.dataservice.impl.ConfigurationPOServiceImpl;
import LMS.dataservice.impl.FinancePOServiceImpl;
import LMS.dataservice.impl.ReceiptPOServiceImpl;
import LMS.dataservice.impl.RepertoryPOServiceImpl;
import LMS.dataservice.impl.UserPOServiceImpl;

public class DataFactory {
	public UserPOService getUserDatabase (int type)throws RemoteException{
		UserPOService data=new UserPOServiceImpl(type);
		return data;
	}
	public ReceiptPOService getReceiptDatabase (int type)throws RemoteException{
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
