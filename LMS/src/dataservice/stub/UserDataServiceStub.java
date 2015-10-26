package dataservice.stub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.rmi.RemoteException;

import po.UserPO;
import dataservice.userdataservice.UserDataService;

public class UserDataServiceStub implements UserDataService{

	@Override
	public void insert(UserPO po) throws RemoteException {
		File sendreceiptlist = new File("Data/User/txt");
//		if(this.type==DataType.TXT){
			try {
//				BufferedWriter bw= new BufferedWriter(new FileWriter("Data/SendReceipt/txt"));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(                        
		                    new FileOutputStream(sendreceiptlist, true))); 
				bw.write("id"+"name"+"password"+"high");
				bw.newLine();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
		
	}

}
